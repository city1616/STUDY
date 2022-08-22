package algo;

import java.io.*;
import java.util.*;

public class _14888_연산자끼워넣기 {
	
	static int N;
	static boolean[] visit;
	static int[] number, select;
	static char[] opt;
	static int max = Integer.MIN_VALUE;
	static int min = Integer.MAX_VALUE;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		number = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < N; i++) {
			number[i] = Integer.parseInt(st.nextToken());
		}
		
		int[] optNum = new int[4];
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < 4; i++) {
			optNum[i] = Integer.parseInt(st.nextToken());
		}
		int idx = 0;
		opt = new char[N - 1];
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < optNum[i]; j++) {
				if(i == 0) {
					opt[idx++] = '+';
				} else if(i == 1) {
					opt[idx++] = '-';
				} else if(i == 2) {
					opt[idx++] = '*';
				} else if(i == 3) {
					opt[idx++] = '/';
				}
			}
		}
		
		visit = new boolean[N - 1];
		select = new int[N - 1]; // 순열로 선택되는 연산자
		perm(0);
		// System.out.println(Arrays.toString(opt));
		System.out.println(max);
		System.out.println(min);
		br.close();
	}
	
	static void perm(int depth) {
		if(depth == N - 1) {
			// System.out.println(Arrays.toString(select));
			int n = cal();
			if(n > max) max = n;
			if(n < min) min = n;
			return;
		}
		for(int i = 0; i < N - 1; i++) {
			if(!visit[i]) {
				visit[i] = true;
				select[depth] = opt[i];
				perm(depth + 1);
				visit[i] = false;
			}
		}
	}
	static int cal() {
		int total = 0;
		if(select[0] == '+') total = number[0] + number[1];
		else if(select[0] == '-') total = number[0] - number[1];
		else if(select[0] == '*') total = number[0] * number[1];
		else if(select[0] == '/') total = number[0] / number[1];
	
		for(int i = 1; i < N - 1; i++) {
			if(select[i] == '+') total += number[i + 1];
			else if(select[i] == '-') total -= number[i + 1];
			else if(select[i] == '*') total *= number[i + 1];
			else if(select[i] == '/') total = total < 0 ? total = -1 * (Math.abs(total) / number[i + 1]) : total / number[i + 1];
		}
		return total;
	}
}

/*

1 2 3 4 5 6
+ + - * /

5 * 4 * 3 * 2 * 1 = 120

*/