package 삼성_SW_역량_테스트_기출_문제;

import java.io.*;
import java.util.*;

public class _14503_로봇청소기 {
	
	static int[] di = {0, -1, 0, 1}; // del 사용으로 이동 기준
	static int[] dj = {-1, 0, 1, 0};
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine(), " ");
		int curi = Integer.parseInt(st.nextToken());
		int curj = Integer.parseInt(st.nextToken());
		int del = Integer.parseInt(st.nextToken());
		int[][] map = new int[N][M];
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j = 0; j < M; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		int chk = 0;
		map[curi][curj] = 2;
		while(true) {
//			for(int i = 0; i < N; i++) {
//				for(int j = 0; j < M; j++) {
//					System.out.print(map[i][j] + " ");
//				}
//				System.out.println();
//			}
			if(map[curi + di[del]][curj + dj[del]] == 0) {
				curi += di[del];
				curj += dj[del];
				del = (del + 3) % 4;
				map[curi][curj] = 2;
			} else {
				chk = 0;
				for(int d = 0; d < 4; d++) {
					int ni = curi + di[d];
					int nj = curj + dj[d];
					if(map[ni][nj] != 0) {
						chk++;
					}
				}
				if(chk == 4) {
					if(map[curi + di[(del + 3) % 4]][curj + dj[(del + 3) % 4]] != 1) {
						curi += di[(del + 3) % 4];
						curj += dj[(del + 3) % 4];
					} else {
						break;
					}
				} else {
					del = (del + 3) % 4;
				}
			}
		}
		int cnt = 0;
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				if(map[i][j] == 2) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
}
