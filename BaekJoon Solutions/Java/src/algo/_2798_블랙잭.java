package algo;

import java.io.*;
import java.util.*;

public class _2798_블랙잭 {
	
	static int N, M, max = Integer.MIN_VALUE;
	static int[] card;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[N];
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());
		
		// System.out.println(Arrays.toString(arr));
		
		card = new int[3];
		comb(0, 0, arr);
		System.out.println(max);
		br.close();
	}
	
	static void comb(int depth, int start, int[] arr) {
		if(depth == 3) {
			int total = 0;
			for(int i = 0; i < 3; i++) total += card[i];
			if(total <= M) max = Math.max(max, total);
			// System.out.println(Arrays.toString(card));
			return;
		}
		for(int i = start; i < N; i++) {
			card[depth] = arr[i];
			comb(depth + 1, i + 1, arr);
		}
	}
}
