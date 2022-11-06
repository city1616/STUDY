package algo;

import java.io.*;
import java.util.*;

public class sw_1952_수영장_sol_1 {
	
	static int[] coins;
	static int[] month;
	static int min;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc <= T; tc++) {
			coins = new int[4];
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for(int i = 0; i < 4; i++) {
				coins[i] = Integer.parseInt(st.nextToken());
			}
			month = new int[12];
			st = new StringTokenizer(br.readLine(), " ");
			for(int i = 0; i < 12; i++) {
				month[i] = Integer.parseInt(st.nextToken());
			}
			
			min = Integer.MAX_VALUE;
			dfs(0, 0);
			min = min > coins[3] ? coins[3] : min; // 1년 이용권과 비교
			
			sb.append("#").append(tc).append(" ").append(min).append("\n");
		}
		System.out.println(sb);
	}
	
	static void dfs(int m, int sum) {
		if(m >= 12) {
			min = min > sum ? sum : min;
			return;
		}
		
		if(month[m] == 0) {
			dfs(m + 1, sum);
		} else {
			dfs(m + 1, sum + (month[m] * coins[0])); // 하루 이용권 사용
			dfs(m + 1, sum + coins[1]); // 한달 이용권 사용
			dfs(m + 3, sum + coins[2]); // 세달 이용권 사용
		}
		
	}
}
