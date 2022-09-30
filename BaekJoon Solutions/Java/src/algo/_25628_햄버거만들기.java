package algo;

import java.io.*;
import java.util.*;

public class _25628_햄버거만들기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int result = Math.min(a / 2, b);
		System.out.println(result);
		br.close();
	}
}
