import java.util.Scanner;

public class ExceptionExample1 {
	public static void main(String[] args) {

		Scanner rd = new Scanner(System.in);
		int divisor = 0;
		int dividend = 0;

		System.out.print("나뉨수를 입력하시오 : "); // a/b에서 a에 해당하는 수 입력
		dividend = rd.nextInt();  // 키보드로부터 정수 입력
		System.out.print("나눗수를 입력하시오 : ");  // a/b에서 b에 해당하는 수 입력
		divisor = rd.nextInt();    //  키보드로부터 정수 입력
		System.out.println(dividend + "를 " + divisor + "로 나누면 몫은 " + dividend / divisor + "입니다.");

	}
}