# Git Study
===

## clone, pull  

* clone - 원격 저장소에 있는 프로젝트 내용을 가져온다. 로컬 저장소의 내용이 원격 저장소의 내용과 일치해진다.
* pull - 원격 저장소에 있는 프로젝트 내용을 가져온다. 원격 저장소의 내용을 가져와서 현재 브랜치와 병합 해준다. 기존에 작업했던 내용을 유지하면서 최신 코드로 업데이트 할 수 있다.

## 터미널 Git 한글 파일명 깨짐 현상 해결 방법

* 터미널에서 git 명령어를 입력시 다음과 같이 한글명이 깨지는 현상 발생
'''
"\353\202\264\354\240\201.py"
'''
* git의 core.quotepath는 이름을 조정하는데, 0x80보다 큰 바이트를 가진 문자는 unusal 케이스로 포함되어 파일명이 깨지게 된다.
* git의 core.quotepath 옵션은 기본적으로 true로 설정되어 있다. 
* 해결 방안으로는 다음과 같이 core.quotepath 옵션을 false로 변경하면 파일 한글명이 정상적으로 출력된다.
'''
git config core.quotepath false
git config --global core.quotepath false
'''

## 참고

* 팀 개발을 위한 Git, GitHub 시작하기 