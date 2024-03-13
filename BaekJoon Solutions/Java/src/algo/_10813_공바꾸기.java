package algo;

import java.io.*;
import java.util.*;

public class _10813_공바꾸기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[N + 1];
		for(int i = 0; i < N + 1; i++) arr[i] = i;
		
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int to = Integer.parseInt(st.nextToken());
			int from = Integer.parseInt(st.nextToken());
			int tmp;

			tmp = arr[to];
			arr[to] = arr[from];
			arr[from] = tmp;
		}
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i < N + 1; i++) sb.append(arr[i]).append(" ");
		System.out.println(sb);
		br.close();
	}
}
