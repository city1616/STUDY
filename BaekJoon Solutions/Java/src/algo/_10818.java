package algo;

import java.io.*;
import java.util.StringTokenizer;

public class _10818 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] arr = new int[N];
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		for(int num : arr) {
			if(num > max) {
				max = num;
			}
			if(num < min) {
				min = num;
			}
		}
		System.out.println(min + " " + max);
		System.out.println(Integer.max(5, 2));
	}
}
