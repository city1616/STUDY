package algo;

import java.io.*;
import java.util.*;

public class _1712_손익분기점 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		long A = Integer.parseInt(st.nextToken());
		long B = Integer.parseInt(st.nextToken());
		long C = Integer.parseInt(st.nextToken());
		long cnt = -1;

		if(B >= C) {
			cnt = -1;
		} else {
			cnt = A / (C - B) + 1;
		}

		System.out.println(cnt);
		br.close();
	}
}
