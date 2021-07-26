package test2;
import java.util.Scanner;

public class FlowTest21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int number = (int)(Math.random() * 100) + 1;
		int inNumber = 0;
		
		do {
			System.out.println("숫자를 입력하세요.");
			inNumber = scan.nextInt();
			
			if(inNumber == number) {
				System.out.println("맞췄습니다.");
				break;
			}
			else if(inNumber < number) {
				System.out.println("숫자가 작습니다.");
			}
			else {
				System.out.println("숫자가 큽니다.");
			}
		}while(true);

	}

}
