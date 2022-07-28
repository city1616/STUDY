package algo;

import java.util.Scanner;

public class _10950_A_더하기_B_빼기_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for(int i = 0; i < N; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int sum = A + B;
			System.out.println(sum);
		}
		sc.close();
	}
}
