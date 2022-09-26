package algo;

import java.io.*;
import java.util.*;

public class _2667_단지번호붙이기 {
	
	static int N;
	static int[][] map;
	static int[] di = {0, 1, 0, -1};
	static int[] dj = {1, 0, -1, 0};
	static boolean[][] visit;
	static int cnt;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		N = Integer.parseInt(br.readLine());
		
		map = new int[N][N];
		visit = new boolean[N][N];
		
		for(int i = 0; i < N; i++) {
			String temp = br.readLine();
			for(int j = 0; j <N; j++) {
				map[i][j] = temp.charAt(j) - '0';
				if(map[i][j] == 0) visit[i][j] = true;
			}
		}
		// for(int[] m : map) System.out.println(Arrays.toString(m));
		// System.out.println();
		
		int dong = 0;
		List<Integer> result = new ArrayList<>();
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				if(visit[i][j] == false) {
					cnt = 0;
					// dfs(i, j, dong++);
					bfs(i, j, dong++);
					result.add(cnt);
				}
			}
		}
		
		// for(int[] m : map) System.out.println(Arrays.toString(m));
		// System.out.println();
		sb.append(dong).append("\n");
		Collections.sort(result);
		for(int i = 0; i < result.size(); i++) {
			sb.append(result.get(i)).append("\n");
		}
		System.out.print(sb);
	}
	
	static void dfs(int i, int j, int dong) {
		visit[i][j] = true;
		map[i][j] = dong + 1;
		cnt++;
		for(int d = 0; d < 4; d++) {
			int ni = i + di[d];
			int nj = j + dj[d];
			if(ni >= 0 && ni < N && nj >= 0 && nj < N && !visit[ni][nj]) {
				dfs(ni, nj, dong);
			}
		}
	}
	
	static void bfs(int i, int j, int dong) {
		ArrayDeque<int[]> q = new ArrayDeque<>();
		visit[i][j] = true;
		q.offer(new int[] {i, j});
		while(!q.isEmpty()) {
			int[] ij = q.poll();
			i = ij[0];
			j = ij[1];
			cnt++;
			map[i][j] = dong + 1;
			for(int d = 0; d < 4; d++) {
				int ni = i + di[d];
				int nj = j + dj[d];
				if(ni >= 0 && ni < N && nj >= 0 && nj < N && !visit[ni][nj]) {
					visit[ni][nj] = true;
					q.offer(new int[] {ni, nj});
				}
			}
		}
	}
}
