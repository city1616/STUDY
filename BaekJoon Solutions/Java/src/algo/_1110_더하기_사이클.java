package algo;

import java.util.Scanner;

public class _1110_더하기_사이클 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		int intN = Integer.parseInt(N);
		
		int cnt = 1;
		while(true) {
			if(N.length() == 0) N = "0" + N;
			int sum = 0;
			for(int i = 0; i < N.length(); i++) {
				sum += N.charAt(i) - '0';
			}
			String sum_tmp = Integer.toString(sum);
			String front = Character.toString(N.charAt(N.length() - 1));
			String back = Character.toString(sum_tmp.charAt(sum_tmp.length() - 1));
			// N = N.charAt(N.length() - 1) + sum_tmp.charAt(sum_tmp.length() - 1);
			N = front + back;
			if(Integer.parseInt(N) == intN) {
				break;
			}
			// System.out.println(N);
			cnt++;
		}
		System.out.println(cnt);
		sc.close();
	}
}
