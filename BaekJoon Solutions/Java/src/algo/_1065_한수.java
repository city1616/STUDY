package algo;

import java.io.*;

public class _1065_한수 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		if(number < 100) {
			System.out.println(number);
		} else {
			cnt += 99;
			for(int i = 100; i <= number; i++) {
				String s = Integer.toString(i);
				int num1 = s.charAt(0) - s.charAt(1);
				int num2 = s.charAt(1) - s.charAt(2);
				if(num1 == num2) cnt += 1;
			}
			System.out.println(cnt);
		}
	}
}
