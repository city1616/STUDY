package algo;

import java.io.*;
import java.util.*;

public class _13549_숨바꼭질3 {
	
	static class Node {
		int i, s;
		public Node(int i, int s) {
			this.i = i;
			this.s = s;
		}
	}
	static int N, K;
	static int[] arr;

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("./input/13549.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		
		arr = new int[100001];
		for(int i = 0; i < 100001; i++) arr[i] = -1;
		bfs(N, 0);
		System.out.println(arr[K]);
	}
	
	static void bfs(int i, int s) {
		ArrayDeque<Node> q = new ArrayDeque<>();
		q.offer(new Node(i, s));
		
		while(!q.isEmpty()) {
			Node now = q.poll();
			// System.out.println("i : " + now.i + " s : " + now.s);
			if(arr[now.i] == -1 || arr[now.i] > now.s) arr[now.i] = now.s;
			else continue;
			
//			if(now.i == K) break;
			
			if(now.i != 0 && now.i * 2 <= 100000) q.offer(new Node(now.i * 2, now.s));
			if(now.i + 1 <= 100000) q.offer(new Node(now.i + 1, now.s + 1));
			if(now.i - 1 >= 0) q.offer(new Node(now.i - 1, now.s + 1));
		}
	}
	
	static void dfs(int i, int s) {
		System.out.println("i : " + i + " s : " + s);
		if(i == K) return;

		if(arr[i] == 0) arr[i] = s;
		else return;
		
		if(i + 1 <= 100000) dfs(i + 1, s + 1);
		if(i - 1 >= 0) dfs(i - 1, s + 1);
		if(i * 2 <= 100000) dfs(i * 2, s);
	}
}
