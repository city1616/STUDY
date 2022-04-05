import java.util.Scanner;

public class SearchMain {
	
	//이름으로 검색 예제 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SearchService sv = new SearchService();
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("검색할 회원 이름을 입력하세요.");
			
			String name = sc.next();
			
			boolean searchResult = sv.searchMember(name);
			
			if(searchResult)
				break;
			
			System.out.println("해당 회원이 없습니다.");
		
		}while(true);
	}

}
