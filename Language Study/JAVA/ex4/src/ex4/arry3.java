package ex4;

import java.util.Scanner;

public class arry3 {

	public static void main(String[] args) {
		int b[] = new int[4];
		Scanner ba = new Scanner(System.in);
		
		for(int i = 0; i < 4; i++) {
			
			System.out.print("b[" + i + "] = " );
			b[i] = ba.nextInt();
		}
		
		for( int i = 0 ; i < 4; i++) {
			System.out.println(b[i]);
		}
	
	}

}
