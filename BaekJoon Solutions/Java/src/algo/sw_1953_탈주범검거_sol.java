package algo;

import java.io.*;
import java.util.*;

public class sw_1953_탈주범검거_sol {
	
	static int N, M, R, C, L;
	static int[][] map;
	static String[] type = {
			null, 
			"0312", // 1 : 상하좌우
			"03",   // 2 : 상하
			"12",   // 3 : 좌우
			"02",   // 4 : 상우
			"32",   // 5 : 하우
			"31",   // 6 : 하좌
			"01"    // 7 : 상좌
	}; // 구조물 타입

	static int[] di = {-1, 0, 0, 1}; // 상 좌 우 하
	static int[] dj = {0, 1, -1, 0};
	
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("input/sw_1953.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc <= T; tc++) {
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
			
			int ans = bfs();
			
			sb.append("#").append(tc).append(" ").append(ans).append("\n");
		}
		System.out.print(sb);
		br.close();
	}
	
	static int bfs() {
		int result = 0, time = 1; // 경우의 수, 시간 : 맨홀에 처음 있는 시간 1
		ArrayDeque<int[]> q = new ArrayDeque<>();
		boolean[][] visit = new boolean[N][M];
		visit[R][C] = true;
		q.offer(new int[] {R, C});
		result++;
		
		int dir;
		String info = null;
		
		while(time++ < L) {
			int qSize = q.size();
			
			// while(qSize-- > 0) {
			for(int qs = 0; qs < qSize; qs++) {
				int[] ij = q.poll();
				int i = ij[0];
				int j = ij[1];
				info = type[map[i][j]];
				for(int d = 0, length = info.length(); d < length; ++d) {
					dir = info.charAt(d) - '0';
					int ni = i + di[dir];
					int nj = j + dj[dir];
					if(ni < 0 || ni >= N || nj < 0 || nj >= M) continue;
					if(map[ni][nj] == 0) continue;
					if(visit[ni][nj]) continue;
					if(type[map[ni][nj]].contains(Integer.toString(3 - dir))) {
						visit[ni][nj] = true;
						q.offer(new int[] {ni, nj});
						result++;
					}
				}
			}
		}
		return result;
	}
}
