package algo;

import java.io.*;

public class _2941_크로아티아알파벳 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int cnt = 0;
		for(int i = 0; i < s.length(); i++) {
			// String word = Character.toString(s.charAt(i)) + Character.toString(s.charAt(i + 1));
			// System.out.println(word);
			if(i == s.length() - 1) {
				cnt++;
			} else if(s.charAt(i) == 'c') {
				if(s.charAt(i + 1) == '=' || s.charAt(i + 1) == '-') {
					cnt++;
					i++;
				} else {
					cnt++;
				}
			} else if (s.charAt(i) == 'd') {
				if(s.charAt(i + 1) == '-') {
					cnt++;
					i++;
				} else if(i < s.length() - 2 && s.charAt(i + 1) == 'z' && s.charAt(i + 2) == '=') {
					cnt++;
					i += 2;
				} else {
					cnt++;
				}
			} else if (s.charAt(i) == 'l' && s.charAt(i + 1) == 'j') {
				cnt++;
				i++;
			} else if (s.charAt(i) == 'n' && s.charAt(i + 1) == 'j') {
				cnt++;
				i++;
			} else if (s.charAt(i) == 's' && s.charAt(i + 1) == '=') {
				cnt++;
				i++;
			} else if (s.charAt(i) == 'z' && s.charAt(i + 1) == '=') {
				cnt++;
				i++;
			} else {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
