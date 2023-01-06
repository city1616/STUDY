package algo;

import java.io.*;
import java.util.*;

public class _1325_효율적인해킹 {
	
	static int N, M, cnt;
	static List<Integer>[] g;
	static boolean[] visit;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		g = new List[N];
		for(int i = 0; i < N; i++) g[i] = new ArrayList<>();
		
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int to = Integer.parseInt(st.nextToken()) - 1;
			int from = Integer.parseInt(st.nextToken()) - 1;
			g[from].add(to);
		}
		int max = -1;
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i < N; i++) {
			cnt = 0;
			visit = new boolean[N];
			dfs(i);
			if(max == -1) {
				list.add(i + 1);
				max = cnt;
			} else {
				if(cnt > max) {
					list = new ArrayList<>();
					list.add(i + 1);
					max = cnt;
				} else if(cnt == max) {
					list.add(i + 1);
				}
			}
		}
		Collections.sort(list);
		for(int i : list) System.out.print(i + " ");
		System.out.println();
	}
	
	static void dfs(int i) {
		visit[i] = true;
		cnt++;
//		System.out.println(cnt);
		for(int j : g[i]) {
			if(!visit[j]) {
				dfs(j);
			}
		}
	}
}
