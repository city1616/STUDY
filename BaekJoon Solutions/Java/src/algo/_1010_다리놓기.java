package algo;

import java.io.*;
import java.util.*;

public class _1010_다리놓기 {

	static int N, M, cnt;
	static int[] a;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		int[][] dp = new int[31][31];
		
		for(int i = 1; i <= 30; i++) {
			dp[i][1] = i;
		}
		
		for(int j = 2; j <= 30; j++) {
			for(int k = 2; k <= 30; k++) {
				dp[j][k] = dp[j - 1][k - 1] + dp[j - 1][k];
			}
		}
		
		for(int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			
			sb.append(dp[M][N]).append("\n");
		}
		System.out.print(sb);
		br.close();
	}
	
	static boolean np() {
		int i = M - 1;
		while(i > 0 && a[i - 1] >= a[i]) i--;
		if(i == 0) return false;
		
		int j = M - 1;
		while(a[i - 1] >= a[j]) j--;
		swap(i - 1, j);
		
		int k = M - 1;
		while(i < k) swap(i++, k--);
		return true;
	}
	
	static void swap(int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	static void comb(int depth, int start) {
		if(depth == N) {
			cnt++;
			return;
		}
		for(int i = start; i < M; i++) {
			comb(depth + 1, i + 1);
		}
	}
}
