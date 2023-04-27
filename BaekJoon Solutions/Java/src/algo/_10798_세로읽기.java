package algo;

import java.io.*;

public class _10798_세로읽기 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		char[][] arr = new char[5][15];
		for(int i = 0; i < 5; i++) {
			String S = br.readLine();
			for(int j = 0; j < S.length(); j++) {
				arr[i][j] = S.charAt(j);
			}
		}
		
		for(int i = 0;  i < 15; i++) {
			for(int j = 0; j < 5; j++) {
				if(arr[j][i] == '\0') continue;
				sb.append(arr[j][i]);
			}
		}
		System.out.println(sb);
		br.close();
	}

}
