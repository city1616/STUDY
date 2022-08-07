package Greedy;

import java.io.*;

public class Q3_문자열_뒤집기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		int cnt = 0;
		for(int i = 0; i < S.length() - 1; i++) {
			if(S.charAt(i) != S.charAt(i + 1)) {
				cnt++;
			}
		}
		System.out.println(++cnt / 2);
	}
}
