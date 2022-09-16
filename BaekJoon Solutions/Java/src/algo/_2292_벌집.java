package algo;

import java.io.*;
import java.util.*;

public class _2292_벌집 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		int cnt = 1;
		int ans = 1;
		boolean chk = false;
		if(N != 1) {
			for(int i = 0; i < Integer.MAX_VALUE; i++) {
				if(chk) break;
				for(int j = 0; j < i * 6; j++) {
					// System.out.print(cnt++ + " ");
					cnt++;
					if(cnt == N) {
						chk = true;
						ans = i + 1;
						break;
					}
				}
				// System.out.println();
			}
		}
		System.out.println(ans);
		br.close();
	}
}

/*

1 -> 1
2 3 4 5 6 7 -> 6 -> 1 ~ 6
8 9 10 11 12 13 14 15 16 17 18 19 -> 12 -> 7 ~ 18
19 ~ 36
37 ~ 60

58 - 2 = 56
56 / 6 = 9...2
58 - 1 = 57
57 / 6 = 9 ... 3
4
*/