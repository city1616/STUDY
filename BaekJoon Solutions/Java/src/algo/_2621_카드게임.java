package algo;

import java.io.*;
import java.util.*;

public class _2621_카드게임 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int[] carr = new int[4];
		int[] iarr = new int[10];
		int[] arr = new int[5];
		int ans = 0;
		
		for(int i = 0; i < 5; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			char c = st.nextToken().charAt(0);
			if(c == 'R') {
				carr[0]++;
			} else if(c == 'B') {
				carr[1]++;
			} else if(c == 'Y') {
				carr[2]++;
			} else if(c == 'G') {
				carr[3]++;
			}
			arr[i] = Integer.parseInt(st.nextToken()); 
			iarr[arr[i]]++;
		}
		
		Arrays.sort(arr);

		int cmax = 0;
		for(int i = 0; i < 4; i++) {
			cmax = Math.max(cmax, carr[i]);
		}

		boolean flag = true;
		for(int i = 0; i < 4; i++) {
			if(arr[i] + 1 != arr[i + 1]) flag = false;
		}

//		System.out.println(cmax);
		int imax = 0;
		int idx = 0;
		boolean chk1 = false;
		boolean chk2 = false;
		boolean chk3 = false;
		int three_idx = 0;
		int two_idx = 0;
		int two_idx2 = 0;
		
		for(int i = 1; i < 10; i++) {
			if(imax < iarr[i]) {
				imax = iarr[i];
				idx = i;
			}
			if(iarr[i] == 3) {
				chk1 = true;
				three_idx = i;
			} else if(iarr[i] == 2) {
				if(chk2) {
					chk3 = true;
					two_idx2 = i;
				} else {
					chk2 = true;
					two_idx = i;
				}
			}
		}
		
		if(cmax == 5 && flag) {
			ans = 900 + arr[4];
		} else if(imax == 4) {
			ans = 800 + idx;
		} else if(chk1 && chk2) {
			ans = three_idx * 10 + two_idx + 700;
		} else if(cmax == 5) {
			ans = 600 + arr[4];
		} else if(flag) {
			ans = 500 + arr[4];
		} else if(chk1) {
			ans = 400 + three_idx;
		} else if(chk2 && chk3) {
			ans = Math.max(two_idx, two_idx2) * 10 + Math.min(two_idx, two_idx2) + 300;
		} else if(chk2) {
			ans = 200 + two_idx;
		} else {
			ans = 100 + arr[4];
		}
		
//		System.out.println(Arrays.toString(carr));
//		System.out.println(Arrays.toString(arr));
//		System.out.println(Arrays.toString(iarr));
		System.out.println(ans);
		
	}
}
