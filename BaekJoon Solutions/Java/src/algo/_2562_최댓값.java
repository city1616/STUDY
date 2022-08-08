package algo;

import java.io.*;

public class _2562_최댓값 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[9];
		for(int i = 0; i < 9; i++) arr[i] = Integer.parseInt(br.readLine());
		int max = Integer.MIN_VALUE;
		int maxIdx = 0;
		for(int i = 0; i < 9; i++) {
			if(arr[i] > max) {
				max = arr[i];
				maxIdx = i;
			}
		}
		System.out.println(max);
		System.out.println(maxIdx + 1);
	}
}
