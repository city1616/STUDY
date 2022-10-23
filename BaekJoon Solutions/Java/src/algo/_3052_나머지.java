package algo;

import java.io.*;
import java.util.*;

public class _3052_나머지 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[10];
		for(int i = 0; i < 10; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Set<Integer> set = new HashSet<>();
		for(int num: arr) set.add(num % 42);
		System.out.println(set.size());
	}
}
