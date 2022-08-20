package algo;

import java.io.*;
import java.util.*;

public class _1193_분수찾기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine());
		
		int cnt = 1;
		int i = 1;
		int j = 1;
		boolean chk = false;
		for(int line = 0; line < Integer.MAX_VALUE; line++) {
			if(chk) break;
			for(int m = 0; m <= line + 1; m++) {
				if(cnt == X) {
					chk = true;
					break;
				}
				if(line % 2 == 0) {
					if(m == 0) {
						j += 1;
						cnt++;
					} else {
						i += 1;
						j -= 1;
						cnt++;
					}
				} else {
					if(m == 0) {
						i += 1;
						cnt++;
					} else {
						i -= 1;
						j += 1;
						cnt++;
					}
				}
			}
		}
		// System.out.println("i = " + i + " j = " + j);
		System.out.println(i + "/"+ j);
	}
}
