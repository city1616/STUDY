package algo;

import java.io.*;
import java.util.*;

public class _15649_N과M_1 {

	static int N, M,ans;
	static boolean[] visit;
	static int[] a, b;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		a = new int[N];
		for(int i = 0; i < N; i++) a[i] = i + 1;
		b = new int[M];
		
		visit = new boolean[N];
		perm(0);
		System.out.print(sb); 
	}
	
	static void perm(int m) {
		if(m == M) {
			for(int j : b) sb.append(j).append(" ");
			sb.append("\n");
			return;
		}
		for(int i = 0; i < N; i++) {
			// if(!visit[i]) {
			// 	visit[i] = true;
				b[m] = a[i];
				perm(m + 1);
			// }
		}
	}
	
	static void comb(int m, int start) {
		if(m == M) {
			for(int j : b) sb.append(j).append(" ");
			sb.append("\n");
			return;
		}
		for(int i = start; i < N; i++) {
			b[m] = a[i];
			comb(m + 1, start);
		}
	}
}
