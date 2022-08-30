package algo;

import java.io.*;
import java.util.*;

public class _18405_경쟁적전염 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken()); // matrix size
		int K = Integer.parseInt(st.nextToken()); // 최대 바이러스 번호
		
		int[][] matrix = new int[N][N];
		int min = Integer.MAX_VALUE; // 최소 바이러스 번호
		int max = Integer.MIN_VALUE; // 최대 바이러스 번호
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j = 0; j < N; j++) {
				matrix[i][j] = Integer.parseInt(st.nextToken());
				if(matrix[i][j] != 0 && matrix[i][j] < min) min = matrix[i][j]; // 존재하는 바이러스 범위
				if(matrix[i][j] != 0 && matrix[i][j] > max) max = matrix[i][j]; // min <= virus <= max
			}
		}
		
		st = new StringTokenizer(br.readLine(), " ");
		int S = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		int Y = Integer.parseInt(st.nextToken());
		int cnts = 1;
		boolean[][] visit = new boolean[N][N];
		int[] di = {0, 1, 0, -1}; // 우하좌상
		int[] dj = {1, 0, -1, 0};
		ArrayDeque<int[]> q = new ArrayDeque<>();
		for(int v = min; v <= max; v++) {
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < N; j++) {
					if(matrix[i][j] == v) {
						visit[i][j] = true;
						q.offer(new int[] {i, j});
					}
				}
			}
		}
		for(int second = 0; second < S; second++) {
			int qSize = q.size();
			// while(!q.isEmpty()) {
			for(int a = 0; a < qSize; a++) {	
				int[] ij = q.poll();
				int curi = ij[0];
				int curj = ij[1];
				for(int d = 0; d < 4; d++) {
					int ni = curi + di[d];
					int nj = curj + dj[d];
					if(ni >= 0 && ni < N && nj >= 0 && nj < N && !visit[ni][nj]) {
						visit[ni][nj] = true;
						matrix[ni][nj] = matrix[curi][curj];
						q.offer(new int[] {ni, nj});
					}
				}
			}
		}
		// for(int[] arr : matrix) System.out.println(Arrays.toString(arr));
		System.out.println(matrix[X - 1][Y - 1]);
		br.close();
	}
}
