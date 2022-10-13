package algo;

import java.io.*;
import java.util.*;

public class _2675_문자열_반복 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int R = Integer.parseInt(st.nextToken());
			String S = st.nextToken();
			String result = "";
			for(int i = 0; i < S.length(); i++) {
				for(int j = 0; j < R; j++) {
					result += S.charAt(i);
				}
			}
			System.out.println(result);
		}
	}
}
