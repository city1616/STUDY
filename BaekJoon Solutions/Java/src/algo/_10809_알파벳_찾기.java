package algo;

import java.io.*;

public class _10809_알파벳_찾기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] word = br.readLine().toCharArray();
		int[] wordInt = new int[word.length];
		for(int i = 0; i < wordInt.length; i++) {
			wordInt[i] = Integer.valueOf(word[i]);
		}
		
		int[] result = new int[26];
		for(int i = 0; i < result.length; i++) {
			result[i] = -1;
		}
		for(int i = 0; i < wordInt.length; i++) {
			if(result[wordInt[i] - 97] == -1) {
				result[wordInt[i] - 97] = i;
			}
		}
		for(int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}
}
