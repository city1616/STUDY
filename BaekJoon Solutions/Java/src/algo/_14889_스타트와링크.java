package algo;

import java.io.*;
import java.util.*;

public class _14889_스타트와링크 {
	
	static int N, ans;
	static int[] people;
	static int[][] graph;
	static int[] start, link;
	static int[] startSelect, linkSelect;
	static boolean[] visit, peopleCheck;
	static int startTotal, linkTotal;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		people = new int[N];
		for(int i = 0; i < N; i++) {
			people[i] = i;
		}
		
		graph = new int[N][N];
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for(int j = 0; j < N; j++) {
				graph[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		// for(int[] g : graph) System.out.println(Arrays.toString(g));
		
		visit = new boolean[N];
		peopleCheck = new boolean[N];
		start = new int[N / 2];
		link = new int[N / 2];
		startSelect = new int[2];
		linkSelect = new int[2];
		ans = Integer.MAX_VALUE;
		comb(0, 0);
		
		System.out.println(ans);
		br.close();
	}
	
	static void comb(int depth, int s) {
		if(depth == N / 2) {
			int idx = 0;
			for(int i = 0; i < N; i++) { // link 팀 찾기
				if(!peopleCheck[i]) {
					link[idx++] = i;
				}
			}
			startTotal = 0;
			linkTotal = 0;
			perm(0);
			ans = Math.min(ans, Math.abs(startTotal - linkTotal));
			// System.out.println("start : " + Arrays.toString(start) + " link : " + Arrays.toString(link));
			return;
		}
		for(int i = s; i < N; i++) {
			peopleCheck[i] = true;
			start[depth] = people[i];
			comb(depth + 1, i + 1);
			peopleCheck[i] = false;
		}
	}
	
	static void perm(int depth) { // 순열로 했지만 조합으로 해도 가능
		if(depth == 2) {
			// startTotal += graph[startSelect[0]][startSelect[1]] + graph[startSelect[1]][startSelect[0]];
			// linkTotal += graph[linkSelect[0]][linkSelect[1]] + graph[linkSelect[1]][linkSelect[0]];
			 startTotal += graph[startSelect[0]][startSelect[1]];
			 linkTotal += graph[linkSelect[0]][linkSelect[1]];
			return;
		}
		for(int i = 0; i < N / 2; i++) {
			if(!visit[i]) {
				visit[i] = true;
				startSelect[depth] = start[i];
				linkSelect[depth] = link[i];
				perm(depth + 1);
				visit[i] = false;
			}
		}
	}
}
