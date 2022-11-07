package algo;

import java.io.*;
import java.util.*;

public class sw_1953_탈주범검거2 {
	
	static int N, M, R, C, L;
	static int[][] map;
	static boolean[][] visit;
	
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("input/sw_1953.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc <= T; tc++) {
			int result = 0;
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			R = Integer.parseInt(st.nextToken());
			C = Integer.parseInt(st.nextToken());
			L = Integer.parseInt(st.nextToken());
			
			map = new int[N][M];
			for(int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine(), " ");
				for(int j = 0; j < M; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			visit = new boolean[N][M];
			bfs(R, C);
			
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < M; j++) {
					if(visit[i][j]) result++;
				}
			}
			
			sb.append("#").append(tc).append(" ").append(result).append("\n");
		}
		System.out.print(sb);
		br.close();
	}
	
	static void bfs(int r, int c) {
		int[][] di = {{0, 1, 0, -1}, {0, 1, 0, -1}, {0, 0, 0, 0}, {0, 0, 0, -1}, {0, 1, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, -1}};
		int[][] dj = {{1, 0, -1, 0}, {0, 0, 0, 0}, {1, 0, -1, 0}, {1, 0, 0, 0}, {1, 0, 0, 0}, {0, 0, -1, 0}, {0, 0, -1, 0}};
		int[][] dir = {{2, 4, 5}, {3, 5, 6}, {2, 6, 7}, {3, 4, 7}};
		boolean flag;
		ArrayDeque<int[]> q = new ArrayDeque<>();
		visit[r][c] = true;
		q.offer(new int[] {r, c});
		int cnt = 1;
		while(cnt != L) {
			int qSize = q.size();
			
			for(int qs = 0; qs < qSize; qs++) {
				int[] ij = q.poll();
				int i = ij[0];
				int j = ij[1];
				for(int d = 0; d < 4; d++) {
					int ni = i + di[map[i][j] - 1][d];
					int nj = j + dj[map[i][j] - 1][d];
					if(ni < 0 || ni >= N || nj < 0 || nj >= M) continue;
					if(map[ni][nj] == 0) continue;
					if(visit[ni][nj]) continue;
					
					flag = false;
					for(int chk = 0; chk < 3; chk++) {
						if(map[ni][nj] == dir[d][chk]) flag = true;
					}
					if(flag) continue;
					
					visit[ni][nj] = true;
					q.offer(new int[] {ni, nj});
				}
			}
			cnt++;
			// System.out.println("cnt : " + cnt + " qSize : " + q.size());
		}
	}
}
