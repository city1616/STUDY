package algo;

import java.util.*;
import java.io.*;

public class _2577_숫자의_개수 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] numArr = new int[10];
		int[] arr = new int[3];

		for(int i = 0; i < 3; i++) arr[i] = Integer.parseInt(br.readLine());
		int n = arr[0] * arr[1] * arr[2];

		String number = Integer.toString(n);

		for(int i = 0; i < number.length(); i++) {
			numArr[number.charAt(i) - '0']++;
		}

		for(int i = 0; i < numArr.length; i++) {
			System.out.println(numArr[i]);
		}
	}
}
