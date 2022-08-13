package Implementation;

import java.io.*;

public class Q7_럭키_스트레이트 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		int sum1 = 0;
		int sum2 = 0;
		
		for(int i = 0; i < S.length() / 2; i++) {
			// System.out.print(S.charAt(i));
			sum1 += S.charAt(i) - '0';
		}
		// System.out.println();
		for(int i = S.length() / 2; i < S.length(); i++) {
			// System.out.print(S.charAt(i));
			sum2 += S.charAt(i) - '0';
		}
		if(sum1 == sum2) {
			System.out.println("LUCKY");
		} else {
			System.out.println("READY");
		}
	}
}
