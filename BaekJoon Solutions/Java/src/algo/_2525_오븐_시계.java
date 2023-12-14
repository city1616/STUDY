package algo;

import java.util.Scanner;

public class _2525_오븐_시계 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int M = sc.nextInt();
		int C = sc.nextInt();
		
		H += C / 60;
		M += C % 60;
		
		if(M >= 60) {
			H += M / 60;
			M = M % 60;
		}

		if(H >= 24) {
			H -= 24;
		}
		
		System.out.println(H + " " + M);
		sc.close();
	}
}
