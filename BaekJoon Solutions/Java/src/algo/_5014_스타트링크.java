package algo;

import java.io.*;
import java.util.*;

public class _5014_스타트링크 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int F = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(st.nextToken());
		int G = Integer.parseInt(st.nextToken());
		int U = Integer.parseInt(st.nextToken());
		int D = Integer.parseInt(st.nextToken());
		
		if(S == G) {
			System.out.println(0);
		} else {
			int[] arr = new int[F + 1];
			int cnt = 0;
			
			ArrayDeque<Integer> q = new ArrayDeque<>();
			q.offer(S);
			
			label : while(!q.isEmpty()) {
				int size = q.size();
				for(int s = 0; s < size; s++) {
					int from = q.poll();
					
					
					if(from < 1 || from > F) continue;
					
					if(arr[from] == 0) arr[from] = cnt;
					else continue;
					
					// System.out.println("from : " + from + " cnt : " + cnt);
					
					if(from == G) break label;
					q.offer(from + U);
					q.offer(from - D);
				}
				cnt++;
			}
			
			if(arr[G] != 0) System.out.println(arr[G]);
			else System.out.println("use the stairs");
		}
	}
}
