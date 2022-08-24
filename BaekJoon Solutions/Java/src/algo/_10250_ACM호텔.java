package algo;

import java.io.*;
import java.util.*;

public class _10250_ACM호텔 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		for(int tc = 0; tc < T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int H = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
		
			String fo = N % H == 0 ? Integer.toString(H) : Integer.toString(N % H);
			String ho = "";
			if(N % H == 0) {
				ho = (N / H) < 10 ? "0" + Integer.toString(N / H) : Integer.toString(N / H);
			} else {
				ho = (N / H) + 1 < 10 ? "0" + Integer.toString((N / H) + 1) : Integer.toString((N / H) + 1);
			}
			sb.append(fo).append(ho).append("\n");
		}
		
		System.out.print(sb);
		br.close();
	}
}
