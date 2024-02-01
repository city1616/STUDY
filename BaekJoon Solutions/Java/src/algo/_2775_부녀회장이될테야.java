package algo;

import java.io.*;
import java.util.*;

public class _2775_부녀회장이될테야 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		int[][] arr = new int [15][15];
		for(int i = 1; i <= 15; i++) {
			arr[0][i - 1] = i;
		}

		for(int i = 1; i < 15; i++) {
			arr[i][0] = 1;
			for(int j = 1; j < 15; j++) {
				arr[i][j] = arr[i - 1][j] + arr[i][j - 1];
			}
		}
		
		// for(int[] a : arr) System.out.println(Arrays.toString(a));
		
		for(int tc = 1; tc <= T; tc++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			System.out.println(arr[k][n - 1]);
		}
	}
}

/*
1 4 10 20
1 3 6 10
1 2 3 4
 */


