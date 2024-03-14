package algo;

import java.io.*;

public class _1094_막대기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int X = Integer.parseInt(br.readLine());
		int[] arr = {64, 32, 16, 8, 4, 2, 1};
		int cnt = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(X >= arr[i]) {
				X -= arr[i];
				cnt++;
			}
		}
		System.out.println(cnt);
		br.close();
	}
}
