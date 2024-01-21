package algo;

import java.io.*;
import java.util.*;

public class _1085_직각사각형에서_탈출 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		int[] arr = new int[4];
		arr[0] = x;
		arr[1] = y;
		arr[2] = w - x;
		arr[3] = h - y;
		Arrays.sort(arr);
		System.out.println(arr[0]);
	}
}
