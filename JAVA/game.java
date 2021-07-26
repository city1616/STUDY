import java.util.Scanner;

public class game {

	public static void main(String[] args) {

		System.out.print("가위 바위 보 게임입니다.  ");
		System.out.println("가위, 바위, 보 중에서 입력하세요.");

		String a, b;

		Scanner scan = new Scanner(System.in);

		System.out.print("철수 >>  ");
		a = scan.nextLine();
		System.out.print("영희 >>  ");
		b = scan.nextLine();

		if(a.equals(b)) {
			System.out.println("비겼습니다.");
		}
		else if(a == "가위" && b =="바위") {
			System.out.println("영희가 이겼습니다.");
		}
		else if(a == "바위" && b == "가위") {
			System.out.println("철수가 이겼습니다.");
		}
		else if(a == "바위" && b =="보") {
			System.out.println("영희가 이겼습니다.");
		}
		else if(a == "보" && b == "바위") {
			System.out.println("철수가 이겼습니다.");
		}
		else if(a == "보" && b =="가위") {
			System.out.println("영희가 이겼습니다.");
		}
		else if(a == "가위" && b == "보") {
			System.out.println("철수가 이겼습니다.");
		}
		else {
			System.out.println("잘못 입력되었습니다.");
		}

	}
}