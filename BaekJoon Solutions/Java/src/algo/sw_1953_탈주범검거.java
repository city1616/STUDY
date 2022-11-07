package algo;

import java.io.*;
import java.util.*;

public class sw_1953_탈주범검거 {
	
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
		List<int[]> list_di = new ArrayList<>();
		List<int[]> list_dj = new ArrayList<>();
		list_di.add(new int[] {0, 1, 0, -1}); // 1
		list_dj.add(new int[] {1, 0, -1, 0});
		list_di.add(new int[] {1, -1}); // 2
		list_dj.add(new int[] {0, 0});
		list_di.add(new int[] {0, 0}); // 3
		list_dj.add(new int[] {1, -1});
		list_di.add(new int[] {-1, 0}); // 4
		list_dj.add(new int[] {0, 1});
		list_di.add(new int[] {0, 1}); // 5
		list_dj.add(new int[] {1, 0});
		list_di.add(new int[] {1, 0}); // 6
		list_dj.add(new int[] {0, -1});
		list_di.add(new int[] {0, -1}); // 7
		list_dj.add(new int[] {-1, 0});
		int[] dir = {4, 2, 2, 2, 2, 2, 2};
		// int[][] move = {{1, }, {}, {}, {}};
		
		// System.out.println(list_di.size());
		// System.out.println(Arrays.toString(list_di.get(0)));
		// System.out.println(list_di.get(2)[2]);
		
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
				for(int d = 0; d < dir[map[i][j] - 1]; d++) {
					int ni = i + list_di.get(map[i][j] - 1)[d];
					int nj = j + list_dj.get(map[i][j] - 1)[d];
					if(ni < 0 || ni >= N || nj < 0 || nj >= M) continue;
					if(map[ni][nj] == 0) continue;
					if(visit[ni][nj]) continue;
					
					if(map[i][j] == 1) {
						if(d == 0) {
							if(map[ni][nj] == 2 || map[ni][nj] == 4 || map[ni][nj] == 5) continue;
						} else if(d == 1) {
							if(map[ni][nj] == 3 || map[ni][nj] == 5 || map[ni][nj] == 6) continue;
						} else if(d == 2) {
							if(map[ni][nj] == 2 || map[ni][nj] == 6 || map[ni][nj] == 7) continue;
						} else if(d == 3) {
							if(map[ni][nj] == 3 || map[ni][nj] == 4 || map[ni][nj] == 7) continue;
						}
					} else if(map[i][j] == 2) {
						if(d == 0) {
							if(map[ni][nj] == 3 || map[ni][nj] == 5 || map[ni][nj] == 6) continue;
						} else if(d == 1) {
							if(map[ni][nj] == 3 || map[ni][nj] == 4 || map[ni][nj] == 7) continue;
						}
					} else if(map[i][j] == 3) {
						if(d == 0) {
							if(map[ni][nj] == 2 || map[ni][nj] == 4 || map[ni][nj] == 5) continue;
						} else if(d == 1) {
							if(map[ni][nj] == 2 || map[ni][nj] == 6 || map[ni][nj] == 7) continue;
						}
					} else if(map[i][j] == 4) {
						if(d == 0) {
							if(map[ni][nj] == 3 || map[ni][nj] == 4 || map[ni][nj] == 7) continue;
						} else if(d == 1) {
							if(map[ni][nj] == 2 || map[ni][nj] == 4 || map[ni][nj] == 5) continue;
						}
					} else if(map[i][j] == 5) {
						if(d == 0) {
							if(map[ni][nj] == 2 || map[ni][nj] == 4 || map[ni][nj] == 5) continue;
						} else if(d == 1) {
							if(map[ni][nj] == 3 || map[ni][nj] == 5 || map[ni][nj] == 6) continue;
						}
					} else if(map[i][j] == 6) {
						if(d == 0) {
							if(map[ni][nj] == 3 || map[ni][nj] == 5 || map[ni][nj] == 6) continue;
						} else if(d == 1) {
							if(map[ni][nj] == 2 || map[ni][nj] == 6 || map[ni][nj] == 7) continue;
						}
					} else if(map[i][j] == 7) {
						if(d == 0) {
							if(map[ni][nj] == 2 || map[ni][nj] == 6 || map[ni][nj] == 7) continue;
						} else if(d == 1) {
							if(map[ni][nj] == 3 || map[ni][nj] == 4 || map[ni][nj] == 7) continue;
						}
					}
					
					visit[ni][nj] = true;
					q.offer(new int[] {ni, nj});
				}
			}
			cnt++;
			// System.out.println("cnt : " + cnt + " qSize : " + q.size());
		}
	}
}
