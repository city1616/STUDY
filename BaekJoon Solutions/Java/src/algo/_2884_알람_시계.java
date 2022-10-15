package algo;

import java.util.Scanner;

public class _2884_알람_시계 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		if(M - 45 >= 0) {
			M -= 45;
		} else {
			if(H - 1 == -1) {
				H = 23;
				M += 15;
			} else {
				H -= 1;
				M += 15;
			}
		}
		System.out.println(H + " " + M);
		
		sc.close();
	}
}
