package algo;

import java.io.*;
import java.util.*;

public class _2493_탑 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		Stack<int[]> s = new Stack<>();
		
		for(int i = 1; i <= N; i++) {
			int top = Integer.parseInt(st.nextToken());
			while(!s.isEmpty()) {
				if(s.peek()[1] >= top) {
					sb.append(s.peek()[0]).append(" ");
					break;
				}
				s.pop();
			}
			if(s.isEmpty()) sb.append("0 ");
			s.push(new int[] {i, top});
		}
		
		System.out.println(sb);
	}
}
