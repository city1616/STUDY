package algo;

import java.io.*;
import java.util.*;

public class sw_4008_숫자만들기_sol {
	
	static int N, min, max;
	static int[] card, opt, b;
	static boolean[] visit;

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("input/sw_4008.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());
		for(int tc = 1; tc <= T; tc++) {
			N = Integer.parseInt(br.readLine());
			
			int[] opt_num = new int[4];
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for(int i = 0; i < 4; i++) {
				opt_num[i] = Integer.parseInt(st.nextToken());
			}
			
			card = new int[N];
			st = new StringTokenizer(br.readLine(), " ");
			for(int i = 0; i < N; i++) {
				card[i] = Integer.parseInt(st.nextToken());
			}
			
			opt = new int[N - 1];
			int idx = 0;
			for(int i = 0; i < 4; i++) {
				for(int j = 0; j < opt_num[i]; j++) {
					opt[idx++] = i;
				}
			}
			// System.out.println(Arrays.toString(opt));
			
			visit = new boolean[N - 1];
			b = new int[N - 1];
			min = Integer.MAX_VALUE;
			max = Integer.MIN_VALUE;
			perm(0);
			int ans = max - min;
			sb.append("#").append(tc).append(" ").append(ans).append("\n");
		}
		System.out.print(sb);
		br.close();
	}
	
	static void perm(int depth) {
		if(depth == N - 1) {
			int result = card[0];
			for(int i = 1; i < N; i++) {
				if(b[i - 1] == 0) result += card[i];
				else if(b[i - 1] == 1) result -= card[i];
				else if(b[i - 1] == 2) result *= card[i];
				else if(b[i - 1] == 3) result /= card[i];
			}
			max = Math.max(max, result);
			min = Math.min(min, result);
			return;
		}
		for(int i = 0; i < N - 1; i++) {
			if(!visit[i]) {
				visit[i] = true;
				b[depth] = opt[i];
				perm(depth + 1);
				visit[i] = false;
			}
		}
	}
}
