package algo;

import java.io.*;
import java.util.*;

public class _18310_안테나 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int[] home = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0; i < N; i++) {
			home[i] = Integer.parseInt(st.nextToken());
		}
		
		// System.out.println(Arrays.toString(home));
		Arrays.sort(home);
		// System.out.println(Arrays.toString(home));
		
		System.out.println(home[(N - 1) / 2]); // 집의 가운데 위치만 찾으면 됨...
		
		// 시간초과
//		int[] result = new int[N];
//		for(int i = 0; i < N; i++) {
//			int sum = 0;
//			for(int j = 0; j < N; j++) {
//				sum += Math.abs(home[i] - home[j]);
//			}
//			result[i] = sum;
//		}
//		// System.out.println(Arrays.toString(result));
//
//		int ans = 0;
//		int min = Integer.MAX_VALUE;
//		for(int i = 0; i < N; i++) {
//			if(result[i] < min) {
//				ans = home[i];
//				min = result[i];
//			}
//		}
//		System.out.println(ans);
//		// System.out.println(min);
	}
}
