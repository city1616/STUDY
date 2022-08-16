package algo;

import java.io.*;
import java.util.*;

public class _10757_큰수A더하기B {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

//		long A = Long.parseLong(st.nextToken());
//		long B = Long.parseLong(st.nextToken());
//		long sum = A + B;
		
		char[] A = st.nextToken().toCharArray();
		char[] B = st.nextToken().toCharArray();
		
		ArrayDeque<Character> s = new ArrayDeque<>();
		ArrayDeque<String> ans = new ArrayDeque<>();
		boolean chk = false;

		if(A.length >= B.length) {
			for(int i = 0; i < A.length; i++) {
				s.push(A[i]);
			}
			int bIdx = B.length - 1;
			while(!s.isEmpty()) {
				if(bIdx < 0) {
					int vall = s.pop() - '0';
					if(chk) vall += 1;
					if(vall >= 10) {
						chk = true;
					} else {
						chk = false;
					}
					ans.push(Integer.toString(vall % 10));
				} else {
					char end = s.pop();
					int val = end - '0' + B[bIdx--] - '0'	;
					if(chk) val += 1;
					if(val >= 10) {
						chk = true;
					} else {
						chk = false;
					}
					ans.push(Integer.toString(val % 10));
				}
			}
			if(chk) ans.push("1");
		} else {
			for(int i = 0; i < B.length; i++) {
				s.push(B[i]);
			}
			int aIdx = A.length - 1;
			while(!s.isEmpty()) {
				if(aIdx < 0) {
					int vall = s.pop() - '0';
					if(chk) vall += 1;
					if(vall >= 10) {
						chk = true;
					} else {
						chk = false;
					}
					ans.push(Integer.toString(vall % 10));
				} else {
					char end = s.pop();
					int val = end - '0' + A[aIdx--] - '0'	;
					if(chk) val += 1;
					if(val >= 10) {
						chk = true;
					} else {
						chk = false;
					}
					ans.push(Integer.toString(val % 10));
				}
			}
			if(chk) ans.push("1");
		}
		
		
		String sum = "";
		while(!ans.isEmpty()) {
			sum += ans.pop();
		}
		
		System.out.print(sum);
	}
}
