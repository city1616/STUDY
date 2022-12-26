package algo;

import java.io.*;
import java.util.*;

public class _2573_빙산 {
	
	static class Node {
		int i, j, val;
		public Node(int i, int j, int val) {
			this.i = i;
			this.j = j;
			this.val = val;
		}
	}
	static int N, M;
	static int[][] map;
	static int[] di = {0, 1, 0, -1};
	static int[] dj = {1, 0, -1, 0};
	static ArrayList<Node> list;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		map = new int[N][M];
		list = new ArrayList<>();
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j = 0; j < M; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				if(map[i][j] != 0) {
					list.add(new Node(i, j, map[i][j]));
				}
			}
		}
		
		int year = 1;
		while(true) {
			if(check()) {
				year = 0;
				break;
			}
			
			for(Node node : list) {
				if(node.val == 0) continue;
				int cnt = 0;
				for(int d = 0; d < 4; d++) {
					int ni = node.i + di[d];
					int nj = node.j + dj[d];
					if(ni < 0 || ni >= N || nj < 0 || nj >= M) continue;
					if(map[ni][nj] == 0) cnt++;
				}
				int now = node.val - cnt;
				if(now <= 0) node.val = 0;
				else node.val = now;
			}
			
			for(Node node : list) {
				map[node.i][node.j] = node.val; 
			}
			
			boolean[][] visit = new boolean[N][M];
			boolean flag = false;
			
			for(Node node : list) {
				if(node.val != 0) {
					dfs(node.i, node.j, visit);
					break;
				}
			}
			// for(boolean[] v : visit) System.out.println(Arrays.toString(v));
			for(Node node : list) {
				if(node.val != 0 && !visit[node.i][node.j]) {
					flag = true;
					break;
				}
			}
			
			// System.out.println("year : " + year);
			// for(int[] m : map) System.out.println(Arrays.toString(m));
			if(flag) break;
			year++;
		}
		System.out.println(year);
	}
	
	static void dfs(int i, int j, boolean[][] visit) {
		visit[i][j] = true;
		for(int d = 0; d < 4; d++) {
			int ni = i + di[d];
			int nj = j + dj[d];
			if(ni < 0 || ni >= N || nj < 0 || nj >= M) continue;
			if(visit[ni][nj]) continue;
			if(map[ni][nj] != 0) dfs(ni, nj, visit);
		}
	}
	
	static boolean check() {
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				if(map[i][j] != 0) return false;
			}
		}
		return true;
	}
}

/*
 * 1. 빙산 녹이기
 * 2. 녹은 빙산 덩어리 개수 확인
 */
