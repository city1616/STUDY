package algo;

import java.io.*;
import java.util.*;

public class _1149_RGB거리 {
	
	static int N;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		int[][] cost = new int[N][3];

		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			cost[i][0] = Integer.parseInt(st.nextToken()); // R
			cost[i][1] = Integer.parseInt(st.nextToken()); // G
			cost[i][2] = Integer.parseInt(st.nextToken()); // B
		}
		
		int[][] dp = new int[N + 1][3];
		for(int i = 0; i < N; i++) {
			dp[i + 1][0] = Math.min(dp[i][1], dp[i][2]) + cost[i][0];
			dp[i + 1][1] = Math.min(dp[i][0], dp[i][2]) + cost[i][1];
			dp[i + 1][2] = Math.min(dp[i][0], dp[i][1]) + cost[i][2];
		}
		int result = Math.min(dp[N][0], dp[N][1]);
		result = Math.min(result, dp[N][2]);
		System.out.println(result);
	}
}
