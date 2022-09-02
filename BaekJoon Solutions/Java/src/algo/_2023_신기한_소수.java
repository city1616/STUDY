package algo;

import java.io.*;

public class _2023_신기한_소수 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());

		int start = (int)Math.pow(10, N - 1);
		int end = start * 10;
		
		boolean[] primeArr = new boolean[end + 1];
		primeArr = prime(primeArr, end);
		
		
		int[] val = new int[N];
		for(int i = 0; i <= N - 1; i++) {
			val[i] = (int)Math.pow(10, i);
		}
		
		
		for(int i = start; i < end; i++) {
			if(!primeArr[i]) {
				int chk = 0;
				for(int j = 1; j <= N - 1; j++) {
					if(!primeArr[i / val[j]]) {
						chk += 1;
					}
				}
				if(chk == N - 1) {
					sb.append(i).append("\n");
				}
			}
		}
		System.out.print(sb);
		br.close();
	}
	
	static boolean[] prime(boolean[] b, int n) {
		b[0] = true;
		b[1] = true;
		
		for(int i = 2; i < Math.sqrt(n); i++) {
			if(!b[i]) {
				for(int j = i * i; j <= n; j += i) {
					b[j] = true;
				}
			}
		}
		return b;
	}
}
