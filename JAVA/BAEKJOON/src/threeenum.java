import java.util.Scanner;   //컴파일에러 

public class threeenum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b, c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		if(a < 1 || a > 100 || b < 1 || b > 100 || c < 1 || c > 100) {
			System.out.println("오류");
		}
		if((b > a && a > c) || (c > a && a > b)) {
			System.out.println(a);
		}
		else if((a > b && b > c) || (c > b && b > a)) {
			System.out.println(b);
		}
		else if((a > c && c > b) || (b > c && c > a)) {
			System.out.println(c);
		}
		else if((a == b && a > c) || (a == b && c > b)) {
			System.out.println(a);
		}
		else if((b == c && b > a) || (b == c && a > b)) {
			System.out.println(b);
		}
		else if((a == c && a > b) || (a == c && b > c)) {
			System.out.println(c);
		}
		else if(a == b && b == c && a == c) {
			System.out.println(a);
		}
		else {
			System.out.println("error");
		}
		
	}

}
