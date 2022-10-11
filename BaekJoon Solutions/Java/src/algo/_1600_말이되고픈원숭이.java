package algo;

import java.io.*;
import java.util.*;

public class _1600_말이되고픈원숭이 {
	
	static class Node {
		int r, c, k, cnt;
		public Node(int r, int c, int k, int cnt) {
			this.r = r;
			this.c = c;
			this.k = k;
			this.cnt = cnt;
		}
	}
	
	static int K, W, H;
	static int[][] map;
	static int[] hdi = {1, 2, 2, 1, -1, -2, -2, -1};
	static int[] hdj = {2, 1, -1, -2, -2, -1, 1, 2};
	static int[] di = {0, 1, 0, -1};
	static int[] dj = {1, 0, -1, 0};
	static boolean visit[][][]; // r, c, 말 이동유무
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		K = Integer.parseInt(br.readLine()); // 말처럼 움직일 수 있는 수
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		W = Integer.parseInt(st.nextToken());
		H = Integer.parseInt(st.nextToken());
		map = new int[H][W];
		
		for(int i = 0; i < H; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j = 0; j < W; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		visit = new boolean[H][W][31];
		// dfs(0, 0, K, 0);
		bfs(0, 0);
	}
	
	static void bfs(int i, int j) {
		ArrayDeque<Node> q = new ArrayDeque<>();
		q.offer(new Node(i, j, 0, 0));

		while(!q.isEmpty()) {
			Node cur = q.poll();
			i = cur.r;
			j = cur.c;
			int k = cur.k;
			if(i == H - 1 && j == W - 1) {
				System.out.println(cur.cnt);
				return;
			}
			if(i < 0 || i >= H || j < 0 || j >= W || map[i][j] == 1) continue;
			if(visit[i][j][k]) continue;
			for(int d = 0; d < 4; d++) {
				int ni = i + di[d];
				int nj = j + dj[d];
				q.offer(new Node(ni, nj, k, cur.cnt + 1));
			}
			if(cur.k == K) continue;
			visit[i][j][k] = true;
			for(int d = 0; d < 8; d++) {
				int ni = i + hdi[d];
				int nj = j + hdj[d];
				q.offer(new Node(ni, nj, k + 1, cur.cnt + 1));
			}
		}
		System.out.println(-1);
	}
}
