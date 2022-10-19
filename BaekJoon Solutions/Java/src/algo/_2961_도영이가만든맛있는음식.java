package algo;

import java.io.*;
import java.util.*;

public class _2961_도영이가만든맛있는음식 {
	
	static int N;
	static int[][] f;
	static int min = Integer.MAX_VALUE;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		f = new int[N][2];
		
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			f[i][0] = Integer.parseInt(st.nextToken());
			f[i][1] = Integer.parseInt(st.nextToken());
		}
		
		comb(0, 0, 1, 0); // depth, start, 신맛, 쓴맛
		System.out.println(min);
		br.close();
	}
	
	static void comb(int depth, int start, int s, int b) {
		if(depth != 0) {
			int val = Math.abs(s - b);
			if(val < min) {
				min = val;
			}
		}
		if(depth == N) return;
		for(int i = start; i < N; i++) {
			// result[depth] = a[i];
			comb(depth + 1, i + 1, s * f[i][0], b + f[i][1]);
		}
	}
}
