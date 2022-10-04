package algo;

import java.io.*;
import java.util.*;

public class _2748_피보나치수2 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		long[] dp = new long[N + 1];
		dp[0] = 0;
		dp[1] = 1;
		for(int i = 2; i <= N; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}
		System.out.println(dp[N]);
		br.close();
	}
}
