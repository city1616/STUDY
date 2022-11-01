package algo;

import java.io.*;
import java.util.*;

public class _9372_상근이의여행 {

	static int N, M, time;
	static List<Integer>[] g;
	static boolean[] visit;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		for(int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			
			g = new List[N];
			for(int i = 0; i < N; i++) g[i] = new ArrayList<>();
			
			for(int i = 0; i < M; i++) {
				st = new StringTokenizer(br.readLine(), " ");
				int from = Integer.parseInt(st.nextToken()) - 1;
				int to = Integer.parseInt(st.nextToken()) - 1;
				g[from].add(to);
				g[to].add(from);
			}
			
			visit = new boolean[N];
			time = 0;
			dfs(0);
			System.out.println(time);
		}
		br.close();
	}
	
	static void dfs(int i) {
		if(chk()) return;
		visit[i] = true;
		for(int j : g[i]) {
			if(!visit[j]) {
				time++;
				dfs(j);
			}
		}
	}
	
	static void bfs(int i) {
		ArrayDeque<Integer> q = new ArrayDeque<>();
		visit[i] = true;
		q.offer(i);
		L : while(!q.isEmpty()) {
			int size = q.size();
			for(int s = 0; s < size; s++) {
				if(chk()) break L;
				i = q.poll();
				for(int j : g[i]) {
					if(!visit[j]) {
						visit[j] = true;
						q.offer(j);
					}
				}
			}
			time++;
		}
	}
	
	static boolean chk() {
		for(int i = 0; i < N; i++) {
			if(!visit[i]) return false;
		}
		return true;
	}
}
