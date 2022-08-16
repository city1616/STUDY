package algo;

import java.io.*;
import java.util.*;

public class _15686_치킨배달 {
	
	static int N, M;
	static List<int[]> chick;
	static int[][] select;
	static int[][] map, cmap;
	static boolean[][] visit;
	static int[] di = {0, 1, 0, -1};
	static int[] dj = {1, 0, -1, 0};
	static int cnt, totalCnt = 0;
	static boolean chk = false;
	static int min = Integer.MAX_VALUE;
	static int ans = Integer.MAX_VALUE;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		map = new int[N][N];
		chick = new ArrayList<>(); // 치킨집 위치
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j = 0; j < N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				if(map[i][j] == 2) chick.add(new int[] {i, j});
			}
		}
		select = new int[M][2];
		visit = new boolean[N][N];
		ans = Integer.MAX_VALUE;
		comb(0, 0);
		
		// for(int[] a : chick) System.out.println(Arrays.toString(a));
		System.out.println(ans);
		br.close();
	}
	
	static void comb(int depth, int start) {
		if(depth == M) {
			cmap = new int[N][N];
			totalCnt = 0;
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < N; j++) {
					if(map[i][j] == 0 || map[i][j] == 1) cmap[i][j] = map[i][j];
				}
			}
			for(int i = 0; i < select.length; i++) {
				cmap[select[i][0]][select[i][1]] = 2;
			}
			// for(int[] a : cmap) System.out.println(Arrays.toString(a));
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < N; j++) {
					if(cmap[i][j] == 1) {
						int m = Integer.MAX_VALUE;
						for(int s = 0; s < select.length; s++) {
							int clength = Math.abs(i - select[s][0]) + Math.abs(j - select[s][1]);
							if(clength < m) m = clength;
						}
						totalCnt += m;
//						
//						
//						cnt = 0;
//						bfs(i, j);
//						totalCnt += cnt;
//						if(min > totalCnt) min = totalCnt;
					}
				}
			}
			ans = Math.min(totalCnt, ans);
			return;
		}
		for(int i = start; i < chick.size(); i++) {
			select[depth] = chick.get(i);
			comb(depth + 1, i + 1);
		}
	}
	
	static void bfs(int i, int j) {
		ArrayDeque<int[]> q = new ArrayDeque<>();
		visit[i][j] = true;
		q.offer(new int[] {i, j});
		while(!q.isEmpty()) {
			cnt++;
			if(chk) break;
			for(int k = 0; k < q.size(); k++) { 
				int[] ij = q.poll();
				i = ij[0];
				j = ij[1];
				if(cmap[i][j] == 2) {
					chk = true;
					break;
				}
				for(int d = 0; d < 4; d++) {
					int ni = i + di[d];
					int nj = j + dj[d];
					if(ni >= 0 && ni < N && nj >= 0 && nj < N && !visit[ni][nj]) {
						q.offer(new int[] {ni, nj});
					}
				}
			}
		}
	}
}
