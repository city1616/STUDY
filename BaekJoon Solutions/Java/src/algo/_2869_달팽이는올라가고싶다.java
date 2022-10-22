package algo;

import java.io.*;
import java.util.*;

public class _2869_달팽이는올라가고싶다 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		
		int cnt = 0;
		int ans = (V - B - 1) / (A - B) + 1;
		double val = (double)(V - B) / (A - B);
		cnt = (int)val;
		if(val > cnt) cnt++;
		
		System.out.println(cnt);
		System.out.println(ans);
	}
}
