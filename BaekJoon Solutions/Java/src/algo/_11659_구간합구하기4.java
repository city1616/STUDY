package algo;

// 누적합
import java.io.*;
import java.util.*;

public class _11659_구간합구하기4 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] number = new int[N + 1];
		number[0] = 0;
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 1; i <= N; i++) {
			number[i] = number[i - 1] + Integer.parseInt(st.nextToken());
		}
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			sb.append(number[end] - number[start - 1]);
			if(i != M - 1) sb.append("\n");
		}
		System.out.println(sb);
		br.close();
	}
}
