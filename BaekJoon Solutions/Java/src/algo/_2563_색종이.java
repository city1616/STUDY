package algo;

import java.io.*;
import java.util.*;

public class _2563_색종이 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int sum = 0;
		int[][] arr = new int[100][100];
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			for(int w = x; w < x + 10; w++) {
				for(int h = y; h < y + 10; h++) {
					if(arr[w][h] == 0) {
						arr[w][h] = 1;
						sum++;
					}
				}
			}
		}
		System.out.println(sum);
		br.close();
	}
}

/*
3
3 7
15 7
5 2

260

3 7
5 2
15 7

*/




