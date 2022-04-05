package ex4;

public class ifelse {

	public static void main(String[] args) {
		int month = Integer.parseInt(args[0]);
		
		if(month == 1 || month == 2 || month == 3) {
			System.out.println("봄입니다.");
		}
		else if(month == 4 || month == 5 || month == 6) {
			System.out.println("여름입니다.");
		}
		else if(month == 7 || month == 8 || month == 9) {
			System.out.println("가을입니다.");
		}
		else if(month == 10 || month == 11 || month ==12) {
			System.out.println("겨울입니다.");
		}
		else {
			System.out.println("잘못입력하셨습니다.");
		}
		
	}

}
