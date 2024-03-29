package algo;

import java.io.*;
import java.util.*;

public class _11399_ATM {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int[] arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		int ans = 0;
		int cnt = N;
		for(int i = 0; i < N; i++) {
			ans += arr[i] * cnt;
			cnt--;
		}
		System.out.println(ans);
	}
}
