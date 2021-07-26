package test2;
import java.util.Scanner;

public class FlowTest22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String answer = "서울";
		String inString = "";
		do {
			System.out.println("대한민국의 수도를 입력하세요.");
			inString = scan.next();
			if(inString.equals(answer)) {
				System.out.println("대한민국의 수도는 " + answer + "입니다.");
				break;
			}
			System.out.println("다시 입력해 주세요.");
		}while(true);

	}

}
