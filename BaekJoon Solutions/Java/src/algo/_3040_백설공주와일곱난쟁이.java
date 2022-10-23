package algo;

import java.io.*;
import java.util.*;

public class _3040_백설공주와일곱난쟁이 {
	static int N = 9, R = 7;
	static int[] arr = new int[N];
	static int[] result = new int[R];
	static boolean chk = false;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		// 아홉 난쟁이가 쓴 모자에 쓰여 있는 수 입력
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		comb(0, 0);
		
		for(int n : result) sb.append(n).append("\n");
		System.out.print(sb);
		br.close();
	}
	
	static void comb(int depth, int start) {
		if(depth == R) {
			int sum = 0;
			for(int n : result) sum += n;
			if(sum == 100) chk = true;
			return;
		}
		for(int i = start; i < N; i++) {
			result[depth] = arr[i];
			comb(depth + 1, i + 1);
			if(chk) break;
		}
	}
}
