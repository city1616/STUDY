package algo;

import java.io.*;
import java.util.*;

public class _15651_N과M_3 {
	
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
		
		perm(0);
		System.out.print(sb);
		br.close();
	}
	
	static void perm(int depth) {
		if(depth == M) {
			for(int i = 0; i < M; i++) {
				sb.append(b[i]).append(" ");
			}
			sb.append("\n");
			return;
		}
		for(int i = 0; i < N; i++) {
			b[depth] = a[i];
			perm(depth + 1);
		}
	}
}
