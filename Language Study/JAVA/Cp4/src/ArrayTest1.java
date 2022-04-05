
public class ArrayTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열 선언
		int ages[];
		String names[];
		
		//배열 객체 생성
		ages = new int[3];
		names = new String[3];
		
		//초기화
		ages[0] = 1;
		ages[1] = 2;
		ages[2] = 3;
		
		names[0] = "혿길동";
		names[1] = "김우빈";
		names[2] = "이종석";
		
		//값 출력
		for(int i = 0; i < 3; i++) {
			System.out.println("ages[ " + i + " ] = " + ages[i]);
			System.out.println("names[ " + i + " ] = " + names[i]);
		}

	}

}
