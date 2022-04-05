import java.util.Scanner;

public class ADD {

	public static void main(String[] args) {
		int a, b, result;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("a와 b를 입력하세요.");
		
		a = scan.nextInt();
		b = scan.nextInt();
		
		if(a > 0 && b < 10) {
			
			result = a + b;
			System.out.println("a + b = " + result);
		}
		
		else {
			System.out.println("범위가 맞지 않습니다.(0 < a, b > 10)");

		}
		
	}

}
