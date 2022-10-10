package algo;

import java.io.*;
import java.util.*;

public class _2239_스도쿠 {
	
	static int[][] map;
	static List<Point> list;
	
	static class Point {
		int r, c;
		public Point(int r, int c) {
			this.r = r;
			this.c = c;
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		map = new int[9][9];
		list = new ArrayList<>();
		
		for(int i = 0; i < 9; i++) {
			String S = br.readLine();
			for(int j = 0; j < 9; j++) {
				map[i][j] = S.charAt(j) - '0';
				if(map[i][j] == 0) {
					list.add(new Point(i, j));
				}
			}
		}
		
		make(0, map);
	}
	
	static boolean make(int depth, int[][] map) {
		if(depth == list.size()) {
			for(int[] r : map) {
				for(int c : r) System.out.print(c);
				System.out.println();
			}
			return true;
		}
		
		int[][] newMap = new int[9][9];
		copyMap(map, newMap);
		
		Point p = list.get(depth);
		for(int i = 1; i <= 9; i++) {
			if(!check(p.r, p.c, i, newMap)) continue;
			newMap[p.r][p.c] = i;
			if(make(depth + 1, newMap)) return true;
		}
		return false;
	}
	
	static void copyMap(int[][] map, int[][] newMap) {
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
				newMap[i][j] = map[i][j];
			}
		}
	}
	
	static boolean check(int r, int c, int x, int[][] map) {
		for(int i = 0; i < 9; i++) {
			if(map[r][i] == x) return false;
			if(map[i][c] == x) return false;
		}
		
		int startR = r - r % 3;
		int startC = c - c % 3;
		for(int R = startR; R < startR + 3; R++) {
			for(int C = startC; C < startC + 3; C++) {
				if(map[R][C] == x) return false;
			}
		}
		return true;
	}
}

