package algo;

import java.io.*;
import java.util.*;

public class _25304_영수증 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		int sum = 0;
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			sum += Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
		}
		if(X == sum) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
