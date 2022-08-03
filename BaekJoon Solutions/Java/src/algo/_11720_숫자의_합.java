package algo;

import java.io.*;

public class _11720_숫자의_합 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		char[] arr = new char[N];
		arr = br.readLine().toCharArray();
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i] - '0';
		}
		System.out.println(sum);
	}
}
