package algo;

import java.io.*;
import java.util.*;

public class _10989_수정렬하기3 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		int[] arr = new int[N];
		for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(br.readLine());
		Arrays.sort(arr);
		for(int i = 0; i < N; i++) sb.append(arr[i]).append("\n");
		System.out.print(sb);
		br.close();
	}
}
