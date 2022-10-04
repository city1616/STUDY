package algo;

import java.io.*;
import java.util.*;

public class _2747_피보나치수 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int[] dp = new int[N + 1];
		dp[0] = 0;
		dp[1] = 1;
		for(int i = 2; i <= N; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}
		System.out.println(Arrays.toString(dp));
		int result = fibo(N);
		System.out.println(dp[N]);
		System.out.println(result);
		
		br.close();
	}
	
	static int fibo(int n) {
		if(n == 0) return 0;
		if(n == 1) return 1;
		return fibo(n - 1) + fibo(n - 2);
	}
}
