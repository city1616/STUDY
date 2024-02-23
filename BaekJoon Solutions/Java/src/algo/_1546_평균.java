package algo;

import java.io.*;
import java.util.*;

public class _1546_평균 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int[] score = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());

		for(int i = 0; i < N; i++) score[i] = Integer.parseInt(st.nextToken());

		int max = Integer.MIN_VALUE;
		for(int num: score) {
			if(num > max) max = num;
		}
		double sum = 0;
		for(int num: score) {
			// System.out.println(1.0 * num / max * 100);
			sum +=  (double)num / max * 100;
		}
		System.out.println(sum / N);
	}
}
