package algo;

import java.io.*;

public class _11729_하노이탑이동순서 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		
		
		br.close();
	}
	
	static void hanoi(int n) {
		if(n == 1) {
			return;
		}
		hanoi(n - 1);
	}
}
