package algo;

import java.io.*;
import java.util.*;

public class _25501_재귀의귀재 {
	
	static int cnt;
	
	public static int recursion(String s, int l, int r) {
        cnt += 1;
		if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1);
    }
    public static int isPalindrome(String s){
    	cnt = 0;
        return recursion(s, 0, s.length()-1);
    }
    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int T = Integer.parseInt(br.readLine());
    	for(int i = 0; i < T; i++) {
    		String S = br.readLine();
    		System.out.println(isPalindrome(S) + " " + cnt);
    	}
    }
}
