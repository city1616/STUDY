package algo;

import java.io.*;
import java.util.*;

public class _15655_N과M_6 {
	
	static int N, M;
	static int[] in, out;
	static List<int[]> list;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		in = new int[N];
		out = new int[M];
		list = new ArrayList<>();
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < N; i++) in[i] = Integer.parseInt(st.nextToken());
		
		comb(0, 0);
		for(int i = 0; i < list.size(); i++) {
			for(int j = 0; j < M; j++) {
				System.out.print(list.get(i)[j] + " ");
			}
			System.out.println();
		}
	}
	
	static void comb(int depth, int start) {
		if(depth == M) {
			Arrays.sort(out);
//			for(int i = 0; i < M; i++) {
//				System.out.print(out[i] + " ");
//			}
			list.add(out);
//			System.out.println();
			return;
		}
		for(int i = start; i < N; i++) {
			out[depth] = in[i];
			comb(depth + 1, i + 1);
		}
	}

}
