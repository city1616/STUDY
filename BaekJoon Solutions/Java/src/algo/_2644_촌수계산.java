package algo;

import java.io.*;
import java.util.*;

public class _2644_촌수계산 {
	
	static int N, start, end, cnt;
	static List<Integer>[] g;
	static boolean[] visit;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		N = Integer.parseInt(br.readLine());
		g = new List[N];
		for(int i = 0; i < N; i++) g[i] = new ArrayList<>();
		
		st = new StringTokenizer(br.readLine(), " ");
		start = Integer.parseInt(st.nextToken()) - 1;
		end = Integer.parseInt(st.nextToken()) - 1;
		
		int E = Integer.parseInt(br.readLine());
		for(int i = 0; i < E; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int from = Integer.parseInt(st.nextToken()) - 1;
			int to = Integer.parseInt(st.nextToken()) - 1;
			g[from].add(to);
			g[to].add(from);
		}
		
		visit = new boolean[N];
		cnt = 0;
		bfs(start);
		
		if(cnt == 0) {
			System.out.println(-1);
		} else {
			System.out.println(cnt);
		}
		br.close();
	}
	
	static void bfs(int i) {
		ArrayDeque<Integer> q = new ArrayDeque<>();
		visit[i] = true;
		q.offer(i);
		
		int depth = 0;
		while(!q.isEmpty()) {
			int size = q.size();
			for(int s = 0; s < size; s++) {
				i = q.poll();
				
//				System.out.println(i);
				if(i == end) {
					cnt = depth;
					break;
				}
				
				for(int j : g[i]) {
					if(!visit[j]) {
						visit[j] = true;
						q.offer(j);
					}
				}
			}
			depth++;
		}
	}
}
