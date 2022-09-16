package algo;

import java.io.*;
import java.util.*;

public class _2468_안전영역 {
	
	static int N;
	static int[] di = {0, 1, 0, -1};
	static int[] dj = {1, 0, -1, 0};
	static boolean[][] visit;
	static int[][] map;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());

		map = new int[N][N];
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int ans = 1;
		
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for(int j = 0; j < N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				max = Math.max(max, map[i][j]);
				min = Math.min(min, map[i][j]);
			}
		}
		
		for(int water = min; water <= max; water++) {
			visit = new boolean[N][N];
			int cnt = 0;
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < N; j++) {
					if(!visit[i][j] && map[i][j] > water) {
						bfs(i, j, water);
						cnt++;
					}
				}
			}
			ans = Math.max(ans, cnt);
		}
		System.out.println(ans);
	}
	
	static void dfs(int i, int j, int water) {
		visit[i][j] = true;
		for(int d = 0; d < 4; d++) {
			int ni = i + di[d];
			int nj = j + dj[d];
			if(ni < 0 || ni >= N || nj < 0 || nj >= N || visit[ni][nj]) continue;
			if(map[ni][nj] <= water) continue;
			dfs(ni, nj, water);
		}
	}
	
	static void bfs(int i, int j, int water) {
		ArrayDeque<int[]> q = new ArrayDeque<>();
		visit[i][j] = true;
		q.offer(new int[] {i, j});
		
		while(!q.isEmpty()) {
			int[] ij = q.poll();
			i = ij[0];
			j = ij[1];
			for(int d = 0; d < 4; d++) {
				int ni = i + di[d];
				int nj = j + dj[d];
				if(ni < 0 || ni >= N || nj < 0 || nj >= N || visit[ni][nj]) continue;
				if(map[ni][nj] <= water) continue;
				visit[ni][nj] = true;
				q.offer(new int[] {ni, nj});
			}
		}
	}
}