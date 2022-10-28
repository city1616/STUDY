package algo;

import java.io.*;
import java.util.*;

public class _5086_배수와약수 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		while(true) {
			st = new StringTokenizer(br.readLine(), " ");
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			if(N == 0 && M == 0) break;
			
			if(M % N == 0) System.out.println("factor");
			else if(N % M == 0) System.out.println("multiple");
			else System.out.println("neither");
		}
		
		br.close();
	}
}
