package algo;

import java.io.*;
import java.util.*;

public class _14502_연구소 {
	
	static class virus {
		int x, y;
		public virus(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	
	static int N, M;
	static int[][] map;
	static int[] di = {0, 1, 0, -1}; // 우하좌상
	static int[] dj = {1, 0, -1, 0};
	static int result = Integer.MIN_VALUE;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		map = new int[N][M];
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j = 0; j < M; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		DFS(0);
		
		/*
		for(int[] a : map) {
			for(int b: a) {
				System.out.print(b + " ");
			}
			System.out.println();
		}
		*/
		System.out.println(result);
	}
	
	public static void DFS(int depth) {
		if(depth == 3) {
			BFS();
			return;
		}
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				if(map[i][j] == 0) {
					map[i][j] = 1;
					DFS(depth + 1);
					map[i][j] = 0;
				}
			}
		}
	}
	
	public static void BFS() {
		int cnt = 0;
		int[][] virus_map = new int[N][M];
		ArrayDeque<virus> q = new ArrayDeque<>();
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				virus_map[i][j] = map[i][j];
				if(virus_map[i][j] == 2) {
					q.offer(new virus(i, j));
				}
			}
		}
		
		while(!q.isEmpty()) {
			virus v = q.poll();
			
			for(int d = 0; d < 4; d++) {
				int ni = v.x + di[d];
				int nj = v.y + dj[d];
				if(ni >= 0 && ni < N && nj >= 0 && nj < M) {
					if(virus_map[ni][nj] == 0) {
						virus_map[ni][nj] = 2;
						q.offer(new virus(ni, nj));
					}
				}
			}
		}
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				if(virus_map[i][j] == 0) {
					cnt++;
				}
			}
		}
		if(cnt > result) {
			result = cnt;
		}
	}
}
