package algo;

import java.io.*;

public class _1075_나누기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int F = Integer.parseInt(br.readLine());
		N -= (N % 100);
		while(true) {
			if(N % F == 0) {
				break;
			}
			N++;
		}
		System.out.printf("%02d", (N % 100));
		br.close();
	}
}
