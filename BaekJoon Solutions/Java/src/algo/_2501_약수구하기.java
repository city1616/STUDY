package algo;

import java.io.*;
import java.util.*;

public class _2501_약수구하기 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        List<Integer> list = new ArrayList<>();
        for(int i = 1; i * i <= N; i++) {
            if(i * i >= N) list.add(i);
            else if(N % i == 0) {
                list.add(i);
                list.add(N / i);
            }
        }

        Collections.sort(list);
        try {
            System.out.println(list.get(K - 1));
        } catch (Exception e) {
            System.out.println(0);
        }

        br.close();
    }
}
