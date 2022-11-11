package algo;

import java.io.*;
import java.util.*;

public class sw_d5_7793_오나의여신님 {
	
	static int N, M;
	static char[][] map;
	static boolean[][] visit, visitDemon;
	static int[] di = {0, 1, 0, -1};
	static int[] dj = {1, 0, -1, 0};
	static ArrayDeque<int[]> demon = new ArrayDeque<>();

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		for(int tc = 1; tc <= T; tc++) {
			demon.clear();
			st = new StringTokenizer(br.readLine(), " ");
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			
			int sui = -1;
			int suj = -1;
			
			map = new char[N][M];
			visitDemon = new boolean[N][M];
			for(int i = 0; i < N; i++) {
				String S = br.readLine();
				for(int j = 0; j < M; j++) {
					map[i][j] = S.charAt(j);
					if(map[i][j] == '*') {
						demon.offer(new int[] {i, j});
						visitDemon[i][j] = true;
					} else if(map[i][j] == 'S') {
						sui = i;
						suj = j;
					}
				}
			}
			
			visit = new boolean[N][M];
			int result = bfs(sui, suj);
			
			String ans = "";
			if(!check() || result == -1) ans = "GAME OVER";
			else ans = Integer.toString(result);
			sb.append("#").append(tc).append(" ").append(ans).append("\n");
		}
		System.out.print(sb);
		br.close();
	}
	
	static int bfs(int i, int j) {
		ArrayDeque<int[]> q = new ArrayDeque<>();
		visit[i][j] = true;
		q.offer(new int[] {i, j, 0});
		
		while(!q.isEmpty()) {
			int size = q.size();
			for(int k = 0; k < size; k++) {
				int[] cur = q.poll();
				i = cur[0];
				j = cur[1];
				if(map[i][j] == '*') continue;
				int cnt = cur[2];
				for(int d = 0; d < 4; d++) {
					int ni = i + di[d];
					int nj = j + dj[d];
					if(ni < 0 || ni >= N || nj < 0 || nj >= M) continue;
					if(visit[ni][nj] || map[ni][nj] == 'X' || map[ni][nj] == '*') continue;
					visit[ni][nj] = true;
					if(map[ni][nj] == 'D') return cnt + 1;
					map[ni][nj] = 'S';
					q.offer(new int[] {ni, nj, cnt + 1});
				}
			}
			int dSize = demon.size();
			for(int ds = 0; ds < dSize; ds++) {
				int[] curDemon = demon.poll();
				int demonI = curDemon[0];
				int demonJ = curDemon[1];
				for(int d = 0; d < 4; d++) {
					int ndi = demonI + di[d];
					int ndj = demonJ + dj[d];
					if(ndi < 0 || ndi >= N || ndj < 0 || ndj >= M) continue;
					if(visitDemon[ndi][ndj] || map[ndi][ndj] == 'D' || map[ndi][ndj] == 'X') continue;
					visitDemon[ndi][ndj] = true;
					demon.offer(new int[] {ndi, ndj});
					map[ndi][ndj] = '*';
				}
			}
		}
		return -1;
	}
	
	static boolean check() {
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				if(map[i][j] == 'S') return true;
			}
		}
		return false;
	}
}
