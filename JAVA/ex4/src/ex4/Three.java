package ex4;

public class Three {

	public static void main(String[] args) {
		int i = 10;
		System.out.print("정수형 변수 i의 값은 " + i + "이며 ");
		
		String str = (i % 2 == 0) ? "짝수" : "홀수";
		System.out.print(str);
		System.out.println(" 입니다.");
		
	}

}
