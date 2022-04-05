package test2;
import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String nextString = sc.next();
		System.out.println("nextString = " + nextString);
		
		int nextIntNum = sc.nextInt();
		System.out.println("nextIntNum = " + nextIntNum);

	}

}
