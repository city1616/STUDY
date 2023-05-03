package algo;

import java.io.*;
import java.util.*;

public class _2566_최댓값 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] map = new int[9][9];
		StringTokenizer st;
		
		int max = 0;
		int x = 1;
		int y = 1;
		
		for(int i = 0; i < 9; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j = 0; j < 9; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				if(max <= map[i][j]) {
					max = map[i][j];
					x = i + 1;
					y = j + 1;
				}
			}
		}
		
		System.out.println(max);
		System.out.println(x + " " + y);
	}

}
