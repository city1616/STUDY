package algo;

import java.io.*;
import java.util.*;

public class _1158_요세푸스_문제 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		ArrayDeque<Integer> q = new ArrayDeque<>();
		int[] ans = new int[N];
		
		for(int i = 1; i <= N; i++) {
			q.offer(i);
		}
		
		int i = 0;
		sb.append("<");
		while(q.size() > 1) {
			for(int x = 0; x < (K - 1); x++) {
				q.offer(q.poll());
			}
			sb.append(q.poll()).append(", ");
		}
		sb.append(q.poll()).append(">");
		System.out.println(sb);
		br.close();
	}
}

/*

1 2 3 4 5 6 7
3 6 2 7 5 1 4

*/
