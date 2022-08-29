package algo;

import java.io.*;
import java.util.*;

public class _18352_특정거리의도시찾기 {
	
	static int N, M, K, X;
	static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
	static int[] d = new int[300001];
	static boolean[][] matrix;
	static boolean[][] visit;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		X = Integer.parseInt(st.nextToken());
		
		for(int i = 0; i <= N; i++) {
			graph.add(new ArrayList<Integer>());
			d[i] = -1;
		}
		
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			graph.get(a).add(b);
		}
		// System.out.println(graph);
		
		d[X] = 0; // 시작 도시 거리는 0
		ArrayDeque<Integer> q = new ArrayDeque<>();
		q.offer(X);
		while(!q.isEmpty()) {
			// System.out.println(Arrays.toString(d));
			int current = q.poll();
			// 현재 도시에서 이동할 수 있는 모든 도시 탐색
			for(int i = 0; i < graph.get(current).size(); i++) { // graph[current].length
				int next = graph.get(current).get(i);
				// 아직 방문하지 않은 도시인 경우
				if(d[next] == -1) {
					// 최단 거리 갱신
					d[next] = d[current] + 1;
					q.offer(next);
				}
			}
		}
		// 최단 거리가 K인 모든 도시의 번호 오름차순 출력
		boolean check = false;
		for(int i = 1; i <= N; i++) {
			if(d[i] == K) {
				System.out.println(i);
				check = true;
			}
		}
		if(!check) System.out.println(-1);
	}
}