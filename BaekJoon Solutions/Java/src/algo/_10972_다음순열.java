package algo;

import java.io.*;
import java.util.*;

public class _10972_다음순열 {
	
	static int N;
	static int[] a, b, arr;
	static boolean[] visit;
	static boolean chk, p;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		arr = new int[N];
		a = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			a[i] = i + 1;
		}
		b = new int[N];
		visit = new boolean[N];
		chk = false;
		p = false;
		perm(0);
		
		br.close();
	}
	
	static void perm(int depth) {
		if(depth == N) {
			if(chk) {
				for(int i = 0; i < N; i++) {
					System.out.print(b[i] + " ");
				}
				p = true;
				return;
			}
			for(int i = 0; i < N; i++) {
				if(arr[i] == b[i]) chk = true;
			}
			return;
		}
		for(int i = 0; i < N; i++) {
			if(!visit[i]) {
				visit[i] = true;
				b[depth] = a[i];
				perm(depth + 1);
				if(p) break;
				visit[i] = false;
			}
		}
	}
}
