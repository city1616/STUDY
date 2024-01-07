package algo;

import java.io.*;
import java.util.*;

public class _2609_최대공약수와최소공배수 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		System.out.println(gcd(N, M));
		System.out.println(lcm(N, M));
	}
	
	static int gcd(int a, int b) {
		if(b == 0) return a;
		return gcd(b, a % b);
	}
	
	static int lcm(int a, int b) {
		return a * b / gcd(a, b);
	}
}
