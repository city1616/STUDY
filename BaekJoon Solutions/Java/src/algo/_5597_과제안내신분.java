package algo;

import java.io.*;

public class _5597_과제안내신분 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[30];
		for(int i = 0; i < 28; i++) {
			int student = Integer.parseInt(br.readLine());
			arr[student - 1] = 1;
		}
		for(int i = 0; i < 30; i++) {
			if(arr[i] == 0) System.out.println(i + 1);
		}
		br.close();
	}
}
