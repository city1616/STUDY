package algo;

import java.io.*;
import java.util.*;

public class _1316_그룹단어체커 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		for(int tc = 0; tc < N; tc++) {
			char[] c = br.readLine().toCharArray();
			List<Character> list = new ArrayList<>();
			boolean chk = false;
			// System.out.println(Arrays.toString(c));
			list.add(c[0]);
			for(int i = 0; i < c.length - 1; i++) {
				 if(c[i] != c[i + 1]) {
					 list.add(c[i + 1]);
					 // if(i == c.length - 2) list.add(c[i + 1]);
				 }
			}
			// System.out.println(list);
			Collections.sort(list);
			// System.out.println(list);
			for(int i = 0; i < list.size() - 1; i++) {
				if(list.get(i) == list.get(i + 1)) chk = true;
			}
			if(!chk) cnt++;
		}
		System.out.println(cnt);
	}
}
