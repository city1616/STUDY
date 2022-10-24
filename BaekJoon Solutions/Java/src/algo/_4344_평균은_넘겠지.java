package algo;

import java.util.Scanner;

public class _4344_평균은_넘겠지 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			int[] score = new int[N];
			for(int i = 0; i < N; i++) {
				score[i] = sc.nextInt();
			}
			int sum = 0;
			for(int i = 0; i < N; i++) {
				sum += score[i];
			}
			double avg = 1.0 * sum / N;
			
			int cnt = 0;
			for(int i = 0; i < N; i++) {
				if(score[i] > avg) {
					cnt++;
				}
			}
			double result = 1.0 * cnt / N * 100;
			System.out.printf("%.3f%%%n", result);
		}
	}
}
