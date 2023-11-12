package algo;

import java.util.Scanner;

public class _2443_별찍기_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		for(int i = 0; i < N; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < (N - i - 1) * 2 + 1; j++) { // for(int j = i; j < (9 - i); j++)
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}
