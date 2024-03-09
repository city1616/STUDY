package algo;

import java.io.*;
import java.util.*;

public class _1037_약수 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int result;
		if(arr.length == 1) {
			result = arr[0] * arr[0];
		} else {
			Arrays.sort(arr);
			result = arr[0] * arr[N - 1];
		}
		System.out.println(result);
		br.close();
	}
}
