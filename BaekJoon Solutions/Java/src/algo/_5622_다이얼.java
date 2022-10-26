// 14m
package algo;

import java.io.*;

public class _5622_다이얼 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] arr = br.readLine().toCharArray();
		
		int sum = 0;
		for(int i = 0; i < arr.length; i++) { // Check
			if(arr[i] >= 'A' && arr[i] < 'D') sum += 3;
			else if(arr[i] >= 'D' && arr[i] < 'G') sum += 4;
			else if(arr[i] >= 'G' && arr[i] < 'J') sum += 5;
			else if(arr[i] >= 'J' && arr[i] < 'M') sum += 6;
			else if(arr[i] >= 'M' && arr[i] < 'P') sum += 7;
			else if(arr[i] >= 'P' && arr[i] < 'T') sum += 8;
			else if(arr[i] >= 'T' && arr[i] < 'W') sum += 9;
			else if(arr[i] >= 'W' && arr[i] <= 'Z') sum += 10;
			else System.out.println("ERROR");
		}
		System.out.println(sum);
	}
}
