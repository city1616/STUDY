package algo;

import java.io.*;
import java.util.*;

public class _11047_동전0 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		List<Integer> coin = new ArrayList<>();
		for(int i = 0; i < N; i++) {
			int temp = Integer.parseInt(br.readLine());
			if(temp > K) break;
			coin.add(temp);
		}
		
		Collections.sort(coin, Comparator.reverseOrder());
		// System.out.println(coin);
		int cnt = 0;
		for(int i = 0; i < coin.size(); i++) {
			int temp = K / coin.get(i);
			cnt += temp;
			K -= temp * coin.get(i);
		}
		System.out.println(cnt);
		br.close();
	}

}
