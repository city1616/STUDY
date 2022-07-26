package algo;

import java.util.*;
import java.io.*;

public class _10952_A_더하기_B_빼기_5 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		while(true) {
			st = new StringTokenizer(br.readLine());
			int num1 = Integer.parseInt(st.nextToken());
			int num2 = Integer.parseInt(st.nextToken());
			if(num1 + num2 == 0) {
				break;
			} else {
				System.out.println((num1 + num2));
			}
		}
	}
}
