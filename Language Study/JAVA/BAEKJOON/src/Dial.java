import java.util.Scanner;

public class Dial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		char ch[] = new char[str.length()];
		int num[] = new int[str.length()];
		int sec = 0;
		
		for(int i = 0; i < str.length(); i++) {
			ch[i] = str.charAt(i);
		}
		
		/*for(int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}*/
		
		for(int i = 0; i < ch.length; i++) {
			switch(ch[i]) {
			case 'A' :
			case 'B' :
			case 'C' :
				num[i] = 2;
				break;
			case 'D' :
			case 'E' :
			case 'F' :
				num[i] = 3;
				break;
			case 'G' :
			case 'H' :
			case 'I' :
				num[i] = 4;
				break;
			case 'J' :
			case 'K' :
			case 'L' :
				num[i] = 5;
				break;
			case 'M' :
			case 'N' :
			case 'O' :
				num[i] = 6;
				break;
			case 'P' :
			case 'Q' :
			case 'R' :
			case 'S' :
				num[i] = 7;
				break;
			case 'T' :
			case 'U' :
			case 'V' :
				num[i] = 8;
				break;
			case 'W' :
			case 'X' :
			case 'Y' :
			case 'Z' :
				num[i] = 9;
				break;
				default: 
			}
		}
		/*for(int i = 0; i < num.length; i++) {
			System.out.print(num[i]);
		}*/
		
		for(int i = 0; i < num.length; i++) {
			sec += num[i] + 1;
		}
		System.out.println(sec);
	}

}
