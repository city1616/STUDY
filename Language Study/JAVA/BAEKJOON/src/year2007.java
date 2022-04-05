import java.util.Scanner; //성공!!

public class year2007 {

	public static void main(String[] args) {
		
		
		int month, day;
		int x = 0;
		int[] dday = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		
		Scanner scan = new Scanner(System.in);

		month = scan.nextInt();
		day = scan.nextInt();
		
		
		
		for(int i = 0; i < month - 1; i++) {
			x += dday[i];
		}
		
		//System.out.println(x);
		x += day;
		
		//System.out.println(x);
		switch(x % 7) {
		case 0 :
			System.out.println("SUN");
			break;
		case 1 :
			System.out.println("MON");
			break;
		case 2 :
			System.out.println("TUE");
			break;
		case 3 :
			System.out.println("WED");
			break;
		case 4 :
			System.out.println("THU");
			break;
		case 5 :
			System.out.println("FRI");
			break;
		case 6 :
			System.out.println("SAT");
			break;
		
			default :
				System.out.println("요일 계산이 잘못 되었습니다.");
		}
		
	}

}
