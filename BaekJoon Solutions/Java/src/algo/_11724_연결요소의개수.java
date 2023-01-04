package algo;

import java.io.*;
import java.util.*;

public class _11724_연결요소의개수 {

	static int N, M;
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
		visit = new boolean[N];
		
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int from = Integer.parseInt(st.nextToken()) - 1;
			int to = Integer.parseInt(st.nextToken()) - 1;
			g[from].add(to);
			g[to].add(from);
		}
		
		int ans = 0;
		for(int i = 0; i < N; i++) {
			if(!visit[i]) {
				ans++;
				// dfs(i);
				bfs(i);
			}
		}
		
		System.out.println(ans);
	}
	
	static void bfs(int i) {
		ArrayDeque<Integer> q = new ArrayDeque<>();
		visit[i] = true;
		q.offer(i);
		
		while(!q.isEmpty()) {
			i = q.poll();
			for(int j : g[i]) {
				if(!visit[j]) {
					visit[j] = true;
					q.offer(j);
				}
			}
		}
	}
	
	static void dfs(int i) {
		visit[i] = true;
		for(int j : g[i]) {
			if(!visit[j]) {
				dfs(j);
			}
		}
	}
}
