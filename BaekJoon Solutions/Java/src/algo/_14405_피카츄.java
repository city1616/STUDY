package algo;

import java.io.*;
import java.util.*;

public class _14405_피카츄 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		boolean flag = true;
		
		for(int i = 0; i < S.length(); i++) {
			if(S.charAt(i) == 'p') {
				if(S.charAt(i + 1) != 'i') {
					flag = false;
					break;
				}
				i++;
			} else if(S.charAt(i) == 'k') {
				if(S.charAt(i + 1) != 'a') {
					flag = false;
					break;
				}
				i++;
			} else if(S.charAt(i) == 'c') {
				if(S.charAt(i + 1) == 'h' && S.charAt(i + 2) == 'u') {
					i += 2;
				} else {
					flag = false;
					break;
				}
			} else {
				flag = false;
				break;
			}
		}
		
		if(flag) System.out.println("YES");
		else System.out.println("NO");
	}
}
