package algo;

import java.io.*;
import java.util.*;

public class _1244_스위치켜고끄기 {
	
	static int[] state;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		state = new int[N + 1];
		
		for(int i = 1; i < state.length; i++) {
			state[i] = Integer.parseInt(st.nextToken());
		}
		
		int student = Integer.parseInt(br.readLine());
		for(int i = 0; i < student; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int gender = Integer.parseInt(st.nextToken());
			int sw_num = Integer.parseInt(st.nextToken());
			
			if(gender == 1) {
				man(sw_num);
			} else if(gender == 2) {
				woman(sw_num);
			}
		}
		// System.out.println(Arrays.toString(switchArr));
		for(int i = 1; i < state.length; i++) {
			System.out.print(state[i] + " ");
			if(i % 20 == 0) {
				System.out.println();
			}
		}
	}
	
	public static void man(int x) {
		int cur = x;
		while(cur < state.length) {
			if(state[cur] == 0) {
				state[cur] = 1;
			} else if(state[cur] == 1) {
				state[cur] = 0;
			}
			cur += x;
		}
	}
	
	public static void woman(int x) {
		if(state[x] == 0) {
			state[x] = 1;
		} else if(state[x] == 1) {
			state[x] = 0;
		}
		int cnt = 1;
		while((x - cnt) > 0 && (x + cnt) < state.length) {
			if(state[x - cnt] == state[x + cnt]) {
				if(state[x - cnt] == 0) {
					state[x - cnt] = 1;
					state[x + cnt] = 1;
				} else if(state[x - cnt] == 1) {
					state[x - cnt] = 0;
					state[x + cnt] = 0;
				}
				cnt++;
			} else {
				break;
			}
		}
	}
}

