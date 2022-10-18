package algo;

import java.io.*;
import java.util.*;

public class _2839_설탕배달 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int f_cnt = 0;
		int t_cnt = 0;
		
		for(int i = N / 5; i >= 0; i--) {
			if(5 * i == N) {
				f_cnt = i;
				break;
			} else if((N - (5 * i)) % 3 == 0) {
				f_cnt = i;
				t_cnt = (N - (5 * i)) / 3;
				break;
			}
		}
		if(f_cnt == 0 && t_cnt == 0) {
			System.out.println(-1);
		} else {
			// System.out.println("f_cnt : " + f_cnt + " t_cnt : " + t_cnt);
			System.out.println(f_cnt + t_cnt);
		}
	}
}
