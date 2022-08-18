package algo;

import java.io.*;

public class _10872_팩토리얼 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		System.out.println(fac(N));
		
		br.close();
	}
	
	static int fac(int n) {
		if(n == 1 || n == 0) return 1;
		return n * fac(n - 1);
	}
}
