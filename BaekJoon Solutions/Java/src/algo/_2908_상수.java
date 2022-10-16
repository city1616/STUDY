package algo;

import java.io.*;
import java.util.*;

public class _2908_상수 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		String n1 = st.nextToken();
		String n2 = st.nextToken();
		
		String temp1 = "";
		String temp2 = "";
		for(int i = n1.length() - 1; i >= 0; i--) {
			temp1 += n1.charAt(i);
			temp2 += n2.charAt(i);
		}
		if(Integer.parseInt(temp1) > Integer.parseInt(temp2)) System.out.println(temp1);
		else System.out.println(temp2);
	}
}
