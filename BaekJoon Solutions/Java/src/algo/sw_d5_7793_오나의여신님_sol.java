package algo;

import java.io.*;
import java.util.*;

public class sw_d5_7793_오나의여신님_sol {
	
	static int N, M;
	static char[][] map;
	static int[] di = {0, 1, 0, -1};
	static int[] dj = {1, 0, -1, 0};
	static ArrayDeque<int[]> demon = new ArrayDeque<>();
	static ArrayDeque<int[]> sq = new ArrayDeque<>();

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
			
			map = new char[N][M];
			for(int i = 0; i < N; i++) {
				String S = br.readLine();
				for(int j = 0; j < M; j++) {
					map[i][j] = S.charAt(j);
					if(map[i][j] == '*') demon.offer(new int[] {i, j});
					else if(map[i][j] == 'S') sq.offer(new int[] {i, j});
				}
			}
			
			
			sb.append("#").append(tc).append(" ").append(bfs()).append("\n");
		}
		System.out.print(sb);
		br.close();
	}
	
	static String bfs() {
		int result = -1, ni, nj, dSize, sSize, time = 0;
		int[] dCur, sCur;
		
		L : while(true) {
			time++;
			dSize = demon.size();
			for(int k = 0; k < dSize; k++) {
				dCur = demon.poll();
				for(int d = 0; d < 4; d++) {
					ni = dCur[0] + di[d];
					nj = dCur[1] + dj[d];
					if(ni < 0 || ni >= N || nj < 0 || nj >= M) continue;
					if(map[ni][nj] == 'X' || map[ni][nj] == 'D' || map[ni][nj] == '*') continue;
					map[ni][nj] = '*';
					demon.offer(new int[] {ni, nj});
				}
			}
			sSize = sq.size();
			if(sSize == 0) break L;
			while(sSize-- > 0) {
				sCur = sq.poll();
				for(int d = 0; d < 4; d++) {
					ni = sCur[0] + di[d];
					nj = sCur[1] + dj[d];
					if(ni < 0 || ni >= N || nj < 0 || nj >= M) continue;
					if(map[ni][nj] == '.') {
						map[ni][nj] = 'S';
						sq.offer(new int[] {ni, nj});
					} else if(map[ni][nj] == 'D') {
						result = time;
						break L;
					}
				}
			}
		}
		return result > -1 ? result + "" : "GAME OVER";
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
