package algo;

import java.io.*;
import java.util.*;

public class _1181_단어정렬 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		HashSet<String> set = new HashSet<>();
		for(int i = 0; i < N; i++) {
			set.add(br.readLine());
		}

		String[] arr = set.toArray(new String[0]);
		Arrays.sort(arr, (o1, o2) -> {
			if(o1.length() == o2.length()) return o1.compareTo(o2);
			return Integer.compare(o1.length(), o2.length());
		});
		
		for(String s : arr) System.out.println(s);
		br.close();
	}
}
