package algo;

import java.io.*;
import java.util.*;

public class _1012_유기농배추 {
	
	static class Node {
		int i, j;
		public Node(int i, int j) {
			this.i = i;
			this.j = j;
		}
	}
	static int N, M, K;
	static int[][] map;
	static int[] di = {0, 1, 0, -1};
	static int[] dj = {1, 0, -1, 0};

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		for(int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			M = Integer.parseInt(st.nextToken());
			N = Integer.parseInt(st.nextToken());
			K = Integer.parseInt(st.nextToken());
			
			map = new int[N][M];
			ArrayList<Node> list = new ArrayList<>();
			for(int i = 0; i < K; i++) {
				st = new StringTokenizer(br.readLine(), " ");
				int y = Integer.parseInt(st.nextToken());
				int x = Integer.parseInt(st.nextToken());
				map[x][y] = 1;
				list.add(new Node(x, y));
			}
			
			int ans = 0;
			boolean[][] visit = new boolean[N][M];
			for(int i = 0; i < K; i++) {
				if(!visit[list.get(i).i][list.get(i).j]) {
					ans++;
					bfs(list.get(i).i, list.get(i).j, visit);
					// for(boolean[] v : visit) System.out.println(Arrays.toString(v));
				}
			}
			sb.append(ans).append("\n");
		}
		System.out.println(sb);
		br.close();
	}
	
	static void bfs(int i, int j, boolean[][] visit) {
		ArrayDeque<Node> q = new ArrayDeque<>();
		visit[i][j] = true;
		q.offer(new Node(i, j));
		
		while(!q.isEmpty()) {
			Node now = q.poll();

			for(int d = 0; d < 4; d++) {
				int ni = now.i + di[d];
				int nj = now.j + dj[d];

				if(ni < 0 || ni >= N || nj < 0 || nj >= M) continue;
				if(visit[ni][nj]) continue;
				if(map[ni][nj] == 1) {
					visit[ni][nj] = true;
					q.offer(new Node(ni, nj));
				}
			}
		}
	}
}
