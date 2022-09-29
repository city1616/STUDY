package algo;

// 0810 과제
import java.io.*;
import java.util.*;

public class _17406_배열돌리기4 {
	static int N, M, K;
	static int[][] arr;
	static int[][] copy;
	static int[][] point;
	static boolean[] visit;
	static int[][] result;
	static int min = Integer.MAX_VALUE;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		point = new int[K][3];
		// 배열 입력
		arr = new int[N][M];
		copy = new int[N][M];
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j = 0; j < M; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		// 회전 입력
		for(int i = 0; i < K; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			point[i][0] = Integer.parseInt(st.nextToken()) - 1;
			point[i][1] = Integer.parseInt(st.nextToken()) - 1;
			point[i][2] = Integer.parseInt(st.nextToken());
		
		}
		result = new int[K][3];
		visit = new boolean[K];
		perm(0);
//		System.out.println();
//		for(int[] a : arr) System.out.println(Arrays.toString(a));
		System.out.println(min);
	}
	
	static void rotate(int[][] map, int[] pt) {
		for(int s = pt[2]; s > 0; s--) {
			int T = pt[0] - s;
			int L = pt[1] - s;
			int B = pt[0] + s;
			int R = pt[1] + s;
			int tmp = map[T][L];
			for(int i = T; i < B; i++) map[i][L] = map[i + 1][L]; // Left
			for(int i = L; i < R; i++) map[B][i] = map[B][i + 1]; // Bottom
			for(int i = B; i > T; i--) map[i][R] = map[i - 1][R]; // Right
			for(int i = R; i > L; i--) map[T][i] = map[T][i - 1]; // Top
			map[T][L + 1] = tmp;
		}
	}
	
	static void perm(int depth) {
		if(depth == K) {
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < M; j++) {
					copy[i][j] = arr[i][j];
				}
			}
			for(int i = 0; i < K; i++) {
				rotate(copy, result[i]);
			}
			score(copy);
			return;
		}
		for(int i = 0; i < K; i++) {
			if(!visit[i]) {
				visit[i] = true;
				result[depth] = point[i];
				perm(depth + 1);
				visit[i] = false;
			}
		}
	}
	
	static void score(int[][] map) {
		for(int[] a : map) {
			int sum = 0;
			for(int n : a) {
				sum += n;
			}
			if(min > sum) min = sum;
		}
	}
}





