package algo;

import java.io.*;
import java.util.*;

public class _3184_양 {

	static int R, C, cntO, cntV, totalO, totalV;
	static char[][] map;
	static boolean[][] visit;
	static int[] di = {0, 1, 0, -1};
	static int[] dj = {1, 0, -1, 0};
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		
		map = new char[R][C];
		for(int i = 0; i < R; i++) {
			String S = br.readLine();
			for(int j = 0; j < C; j++) {
				map[i][j] = S.charAt(j);
			}
		}
		
		totalO = 0;
		totalV = 0;
		
		visit = new boolean[R][C];
		for(int i = 0; i < R; i++) {
			for(int j = 0; j < C; j++) {
				if(map[i][j] != '#' && !visit[i][j]) {
					cntV = 0;
					cntO = 0;
					dfs(i, j);
					if(cntO > cntV) totalO += cntO;
					else if(cntO <= cntV) totalV += cntV;
				}
			}
		}
		System.out.println(totalO + " " + totalV);
		br.close();
	}
	
	static void dfs(int i, int j) {
		visit[i][j] = true;
		if(map[i][j] == 'v') cntV++;
		else if(map[i][j] == 'o') cntO++;
		for(int d = 0; d < 4; d++) {
			int ni = i + di[d];
			int nj = j + dj[d];
			if(ni < 0 || ni >= R || nj < 0 || nj >= C) continue;
			if(visit[ni][nj] || map[ni][nj] == '#') continue;
			dfs(ni, nj);
		}
	}
	
	static void print() {
		for(int i = 0; i < R; i++) {
			for(int j = 0; j < C; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
	}
}
