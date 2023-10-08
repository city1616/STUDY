package algo;

import java.io.*;
import java.util.StringTokenizer;

public class _1120_문자열 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		String A = st.nextToken();
		String B = st.nextToken();
		int cnt = 0;
		int min = A.length();
		
		for(int i = 0; i < B.length() - A.length() + 1; i++) {
			cnt = 0;
			for(int j = 0; j < A.length(); j++) {
				if(A.charAt(j) != B.charAt(j + i)) {
					cnt++;
				}
			}
			if(cnt < min) min = cnt;
		}
		System.out.println(min);
		br.close();
	}
}
