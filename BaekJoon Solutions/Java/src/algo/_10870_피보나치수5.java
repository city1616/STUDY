package algo;

import java.io.*;

public class _10870_피보나치수5 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		System.out.println(fib(N));
	}
	
	static int fib(int n) {
		if(n == 1) return 1;
		else if(n == 0) return 0;
		return fib(n - 1) + fib(n - 2);
	}
}
