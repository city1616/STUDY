import java.io.*;
import java.util.*;

public class Main_bj_16935_배열돌리기3_서울_20반_문승우 {
	
	static int N, M;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());
		
		int[][] map = new int[N][M];
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j = 0; j < M; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int[] opt = new int[R];
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < R; i++) {
			opt[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 0; i < R; i++) {
			if(opt[i] == 1) map = r1(map);
			else if(opt[i] == 2) map = r2(map);
			else if(opt[i] == 3) map = r3(map);
			else if(opt[i] == 4) map = r4(map);
			else if(opt[i] == 5) map = r5(map);
			else if(opt[i] == 6) map = r6(map);
		}
		// for(int[] a : map) System.out.println(Arrays.toString(a));
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				sb.append(map[i][j]).append(" ");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
	
	static int[][] r1(int[][] map) {
		for(int col = 0; col < M; col++) {
			for(int row = 0; row < N / 2; row++) {
				int temp = map[row][col];
				map[row][col] = map[N - 1 - row][col];
				map[N - 1 - row][col] = temp;
			}
		}
		return map;
	}
	
	static int[][] r2(int[][] map) {
		for(int row = 0; row < N; row++) {
			for(int col = 0; col < M / 2; col++) {
				int temp = map[row][col];
				map[row][col] = map[row][M - 1 - col];
				map[row][M - 1 - col] = temp;
			}
		}
		return map;
	}
	
	static int[][] r3(int[][] map) {
		int[][] copyMap = new int[M][N];
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				copyMap[j][N - 1 - i] = map[i][j];
			}
		}
		int temp = N;
		N = M;
		M = temp;
		return copyMap;
	}
	
	static int[][] r4(int[][] map) {
		int[][] copyMap = new int[M][N];
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				copyMap[M - 1 - j][i] = map[i][j];
			}
		}
		int temp = N;
		N = M;
		M = temp;
		return copyMap;
	}
	
	static int[][] r5(int[][] map) {
		for(int i = 0; i < N / 2; i++) {
			for(int j = 0; j < M / 2; j++) {
				int temp = map[i][j];
				map[i][j] = map[N / 2 + i][j];
				map[N / 2 + i][j] = temp;
			}
		}
		for(int i = N / 2; i < N; i++) {
			for(int j = 0; j < M / 2; j++) {
				int temp = map[i][j];
				map[i][j] = map[i][M / 2 + j];
				map[i][M / 2 + j] = temp;
			}
		}
		for(int i = 0; i < N / 2; i++) {
			for(int j = M / 2; j < M; j++) {
				int temp = map[i][j];
				map[i][j] = map[N / 2 + i][j];
				map[N / 2 + i][j] = temp;
			}
		}
		return map;
	}
	
	static int[][] r6(int[][] map) {
		for(int i = 0; i < N / 2; i++) {
			for(int j = 0; j < M / 2; j++) {
				int temp = map[i][j];
				map[i][j] = map[i][M / 2 + j];
				map[i][M / 2 + j] = temp;
			}
		}
		for(int i = 0; i < N / 2; i++) {
			for(int j = M / 2; j < M; j++) {
				int temp = map[i][j];
				map[i][j] = map[N / 2 + i][j];
				map[N / 2 + i][j] = temp;
			}
		}
		for(int i = N / 2; i < N; i++) {
			for(int j = 0; j < M / 2; j++) {
				int temp = map[i][j];
				map[i][j] = map[i][M / 2 + j];
				map[i][M / 2 + j] = temp;
			}
		}
		return map;
	}
}




