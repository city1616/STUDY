package algo;

import java.io.*;
import java.util.*;

public class _14890_경사로 {
	
	static int N, L;
	static int[][] map;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		L = Integer.parseInt(st.nextToken());
		
		map = new int[N][N];
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j = 0; j < N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		// for(int[] g : map) System.out.println(Arrays.toString(g));
		
		int cnt = 0;
		for(int i = 0; i < N; i++) {
			if(checkRow(i)) cnt++;
			if(checkCol(i)) cnt++;
		}
		System.out.println(cnt);
	}
	
	static boolean checkRow(int row) {
		boolean[] chk = new boolean[N]; // 경사로 설치 여부 확인
		
		for(int i = 0; i < N - 1; i++) {
			int diff = map[row][i] - map[row][i + 1];
			
			if(diff > 1 || diff < -1) {
				return false; // 높이 차가 1을 초가하기 때문에 false
			} else if(diff == -1) { // 다음칸의 높이가 한칸 높다.
				for(int l = 0; l < L; l++) { // 올라가는 경사로를 설치할 수 있는지 확인
					if(i - l < 0 || chk[i - l]) return false; // i 이전이 L보다 작으면 경사로 설치 불가능, 경사로가 설치되어 있으면 경사로 설치 불가능 
					if(map[row][i] != map[row][i - l]) return false;
					chk[i - l] = true; // 경사로 설치
				}
			} else if(diff == 1) { // 다음칸의 높이가 한칸 낮다.
				for(int l = 1; l <= L; l++) { // 내려가는 경사로를 설치할 수 있는지 확인
					if(i + l >= N || chk[i + l]) return false;
					if(map[row][i] - 1 != map[row][i + l]) return false;
					chk[i + l] = true;
				}
			}
		}
		// System.out.println("row : " + row);
		return true;
	}
	
	static boolean checkCol(int col) {
		boolean[] chk = new boolean[N]; // 경사로 설치 여부 확인
		
		for(int i = 0; i < N - 1; i++) {
			int diff = map[i][col] - map[i + 1][col];
			
			if(diff > 1 || diff < -1) {
				return false; // 높이 차가 1을 초가하기 때문에 false
			} else if(diff == -1) { // 다음칸의 높이가 한칸 높다.
				for(int l = 0; l < L; l++) { // 올라가는 경사로를 설치할 수 있는지 확인
					if(i - l < 0 || chk[i - l]) return false; // i 이전이 L보다 작으면 경사로 설치 불가능, 경사로가 설치되어 있으면 경사로 설치 불가능 
					if(map[i][col] != map[i - l][col]) return false;
					chk[i - l] = true; // 경사로 설치
				}
			} else if(diff == 1) { // 다음칸의 높이가 한칸 낮다.
				for(int l = 1; l <= L; l++) { // 내려가는 경사로를 설치할 수 있는지 확인
					if(i + l >= N || chk[i + l]) return false;
					if(map[i][col] - 1 != map[i + l][col]) return false;
					chk[i + l] = true;
				}
			}
		}
		// System.out.println("col : " + col);
		return true;
	}
}
