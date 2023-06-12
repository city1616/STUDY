package algo;

import java.io.*;
import java.util.*;

public class _1654_랜선자르기 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int[] wire = new int[K];
        for(int i = 0; i < K; i++) wire[i] = Integer.parseInt(br.readLine());

        Arrays.sort(wire);

        long start = 0;
        long end = wire[K - 1];
        long half = 0;
        while(start < end) {
            half = (start + end) / 2;


            int sum = 0;
            for(int i = 0; i < K; i++) sum += wire[i] / half;
            System.out.println("start : " + start + " end : " + end);
            System.out.println("half : " + half + " sum : " + sum);

//            if(sum == N) break;
            if(start == end && sum < N) {
                half -= 1;
                break;
            }

            if(sum < N) end = half;
            else start = half;

            if(start >= half) {
                start += 1;
                half -= 1;
            }
//            else start += 1;
        }
        System.out.println(half);
        br.close();
    }
}
