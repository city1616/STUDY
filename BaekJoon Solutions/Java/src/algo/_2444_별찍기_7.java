package algo;

import java.util.Scanner;

public class _2444_별찍기_7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int i = N - 1; i >= 0; i--) {
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for(int j = i; j < (2 * N - 1) - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 0; i < N - 1; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			for(int j = i; j < (2 * (N - 1) - 1) - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}
