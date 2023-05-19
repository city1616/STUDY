package algo;

import java.io.*;
import java.util.*;

public class _1024_수열의합 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        int start = N / L - L;
        int end = start + L - 1;
        int cnt = 0;
        boolean flag = true;

        while(true) {
//            System.out.println("start : " + start + " end : " + end + " L : " + (L + cnt));
            if(start < 0) {
                end -= start;
                start -= start;
//                System.out.println("start : " + start + " end : " + end + " L : " + (L + cnt));
            }


            int sum = 0;
            for(int i = start; i <= end; i++) {
                sum += i;
            }

            if(sum < N) {
                start += 1;
                end += 1;
            } else if(sum == N) {
                break;
            } else {
                if(start != 0) {
                    cnt += 1;
                    start = N / (L + cnt) - L - cnt;
                    end = start + L - 1 + cnt;
                } else {
                    flag = false;
                    break;
                }
            }

            if(L + cnt > 100) {
                flag = false;
                break;
            }
        }
        if(flag) {
            for(int i = start; i <= end; i++) System.out.print(i + " ");
        } else {
            System.out.println(-1);
        }
        br.close();
    }
}
