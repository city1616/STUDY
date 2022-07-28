package algo;

import java.util.*;
import java.io.*;

public class _10951_A_더하기_B_빼기_4 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		while((s = br.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(s);
			int num1 = Integer.parseInt(st.nextToken());
			int num2 = Integer.parseInt(st.nextToken());
			System.out.println((num1 + num2));
		}
	}
}
