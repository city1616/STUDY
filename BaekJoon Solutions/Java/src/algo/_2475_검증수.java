package algo;

import java.io.*;
import java.util.*;

public class _2475_검증수 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int result = 0;
		for(int i = 0; i < 5; i++) {
			int N = Integer.parseInt(st.nextToken());
			result += N * N;
		}
		
		int ans = result % 10;
		System.out.println(ans);
		br.close();
	}
}
