package algo;

import java.io.*;
import java.util.*;

public class _15650_N과M_2 {
	
	static int N, M;
	static int[] a, b;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		a = new int[N];
		b = new int[M];
		for(int i = 0; i < N; i++) a[i] = i + 1;
		
		comb(0, 0); 
		
		System.out.println(sb); 
		br.close();
	}
	
	static void comb(int depth, int start) {
		if(depth == M) {
			for(int i : b) sb.append(i).append(" ");
			sb.append("\n");
			return;
		}
		for(int i = start; i < N; i++) {
			b[depth] = a[i];
			comb(depth + 1, i + 1);
		}
	}
}
