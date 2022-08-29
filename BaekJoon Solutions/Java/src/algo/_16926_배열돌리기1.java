package algo;

import java.io.*;
import java.util.*;

public class _16926_배열돌리기1 {
	static int N, M;
	static int[][] arr;
	static int[] di = {0, 1, 0, -1};
	static int[] dj = {1, 0, -1, 0};
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());
		
		// 배열 입력
		arr = new int[N][M];
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j = 0; j < M; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int s = Math.min(N, M) / 2; // 회전하는 사각형의 갯수
		
		// 배열 회전
 		for(int i = 0; i < R; i++) {
			// rotate(s);
 			rotate1(s);
	 	}
 		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				sb.append(arr[i][j]).append(" ");
			}
			sb.append("\n");
		}
		System.out.print(sb);
		br.close();
	}
	
	static void rotate(int s) {
		for(int i = 0; i < s; i++) {
			int dir = 0; // 방향
			int cnti = i;
			int cntj = i;
			int temp = arr[cnti][cntj];
			while(dir < 4) {
				int ni = cnti + di[dir];
				int nj = cntj + dj[dir];
				
				if(ni >= i && ni < N - i && nj >= i && nj < M - i) {
					arr[cnti][cntj] = arr[ni][nj];
					cnti = ni;
					cntj = nj;
				} else {
					dir++;
				}
			}
			arr[i + 1][i] = temp;
		}
	}
	
	static void rotate1(int sq) {
		for(int s = 0; s < sq; s++) {
			int T = 0 + s; // Top
			int L = 0 + s; // Left
			int B = N - 1 - s; // Bottom
			int R = M - 1 - s; // Right
			int tmp = arr[T][L];
			for(int i = L; i < R; i++) arr[T][i] = arr[T][i + 1]; // 1v
			for(int i = T; i < B; i++) arr[i][R] = arr[i + 1][R]; // 1v
			for(int i = R; i > L; i--) arr[B][i] = arr[B][i - 1]; // 1v
			for(int i = B; i > T; i--) arr[i][L] = arr[i - 1][L]; // 1v
			arr[T + 1][L] = tmp;
		}
	}
	
}

