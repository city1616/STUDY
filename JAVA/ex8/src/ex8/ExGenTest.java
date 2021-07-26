package ex8;

public class ExGenTest {

	public static void main(String[] args) {
		try {
			int a = 0;
			int b = 2;
			System.out.print("2/0은 : ");
			int div = b / a;
			        //ArithmeticException 예외 발생 
			System.out.println(div);
		}
	catch(ArithmeticException e) {
		System.out.println("정석태 프로그램 오류 ");
	}
	}

}
