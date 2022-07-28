package algo;

import java.io.*;
import java.util.*;

public class _11021_A_더하기_B_빼기_7 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= T; i++) {
			st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			System.out.println("Case #" + i + ": " + A + " + " + B + " = " + (A + B));
			
		}
	}
}
