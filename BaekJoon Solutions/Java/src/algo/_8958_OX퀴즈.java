package algo;

import java.io.*;

public class _8958_OX퀴즈 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for(int i = 0; i < n; i++) {
			String s = br.readLine();
			int score = 0;
			int tmp = 0;
			for(int j = 0; j < s.length(); j++) {
				if(s.charAt(j) == 'O') {
					// System.out.println("true");
					tmp++;
					score += tmp;
				} else {
					tmp = 0;
				}
			}
			System.out.println(score);
		}
	}
}
