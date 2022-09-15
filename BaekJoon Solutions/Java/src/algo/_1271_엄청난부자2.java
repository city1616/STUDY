// python

package algo;

import java.io.*;
import java.util.*;

public class _1271_엄청난부자2 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		long N = Long.parseLong(st.nextToken());
		long M = Long.parseLong(st.nextToken());
		
		long cnt = N / M;
		long total = N % M;
		
		System.out.println(cnt);
		System.out.println(total);
	}

}
