package algo;

import java.io.*;
import java.util.*;

public class _1676_팩토리얼0의개수 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int ans = N / 10 * 2;
		if(N % 10 >= 5) ans++;
		if(N >= 25) ans++;
		if(N >= 50) ans++;
		if(N >= 75) ans++;
		if(N >= 100) ans++;
		if(N >= 125) ans++;
		if(N >= 150) ans++;
		if(N >= 175) ans++;
		if(N >= 200) ans++;
		if(N >= 225) ans++;
		if(N >= 250) ans++;
		if(N >= 275) ans++;
		if(N >= 300) ans++;
		if(N >= 325) ans++;
		if(N >= 350) ans++;
		if(N >= 375) ans++;
		if(N >= 400) ans++;
		if(N >= 425) ans++;
		if(N >= 450) ans++;
		if(N >= 475) ans++;
		if(N >= 500) ans++;
		System.out.println(ans);
		
		br.close();
	}
}
