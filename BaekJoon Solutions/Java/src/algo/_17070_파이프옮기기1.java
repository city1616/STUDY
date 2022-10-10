package algo;

import java.io.*;
import java.util.*;

public class _17070_파이프옮기기1 {
	
	static int N;
	static int[][] map;
	static int[] di = {0, 1, 1};
	static int[] dj = {1, 0, 1};
	static boolean[][] visit;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		map = new int[N][N];
		
		visit = new boolean[N][N];
		dfs(0, 1, 0);
		
	}
	
	static void dfs(int i, int j, int dir) {
		visit[i][j] = true;

		for(int d = 0; d < 3; d++) {
			if(dir == 0 && d == 1) continue;
			else if(dir == 1 && d == 0) continue;
			
			int ni = i + di[d];
			int nj = j + dj[d];
			if(ni < 0 || ni >= N || nj < 0 || nj >= N) continue;
			if(dir == 0) {
				if(map[ni][nj] == 1) continue;
			}
		}
	}
	
	static void bfs(int i, int j) {
		
	}
}
