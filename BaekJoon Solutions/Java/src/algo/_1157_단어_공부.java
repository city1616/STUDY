package algo;

import java.io.*;

public class _1157_단어_공부 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] al = br.readLine().toCharArray();
		int[] result = new int[26];
		
		for(int i = 0; i < al.length; i++) {
			if(al[i] >= 97) {
				al[i] -= 32;
			}
			result[al[i] - 65]++;
		}
		int max = Integer.MIN_VALUE;
		int maxIdx = -1;
		
		for(int i = 0; i < result.length; i++) {
			if(result[i] > max) {
				max = result[i];
				maxIdx = i;
			}
		}
		
		int cnt = 0;
		for(int i = 0; i < result.length; i++) {
			if(max == result[i]) {
				cnt++;
			}
		}
		if(cnt == 1) {
			System.out.println((char)(maxIdx + 65));
		} else {
			System.out.println("?");
		}
		// for(char a : al) System.out.print(a);
		// System.out.println();
		// for(int a : result) System.out.print(a);
	}
}
