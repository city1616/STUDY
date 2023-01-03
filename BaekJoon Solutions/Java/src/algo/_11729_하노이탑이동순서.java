package algo;

import java.io.*;

public class _11729_하노이탑이동순서 {
	
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		sb.append((int) (Math.pow(2, N) - 1)).append("\n");
		hanoi(N, 1, 2, 3);
		
		System.out.println(sb);
	}
	
	static void hanoi(int N, int start, int mid, int to) {
		if(N == 1) {
			sb.append(start + " " + to + "\n");
			return;
		}
		// A -> C로 옮긴다고 가정
		
		// N - 1개를 A에서 B로 이동
		hanoi(N - 1, start, to, mid);
		
		// 1개를 A에서 C로 이동
		sb.append(start + " " + to + "\n");
		
		// N - 1개를 B에서 C로 이동
		hanoi(N - 1, mid, start, to);
	}
}
