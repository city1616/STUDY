package algo;

import java.io.*;
import java.util.*;

public class _9506_약수들의합 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true) {
            int N = Integer.parseInt(br.readLine());
            if(N == -1) {
                break;
            }

            int[] arr = new int[N];
            int sum = 0;
            for(int i = 1; i < N; i++) {
                if(N % i == 0) {
                    arr[i - 1] = i;
                    sum += i;
                }
            }
            if(sum == N) {
                sb.append(N).append(" = 1");
                for(int i = 1; i < N; i++) {
                    if(arr[i] != 0) {
                        sb.append(" + ").append(arr[i]);
                    }
                }
            } else {
                sb.append(N).append(" is NOT perfect.");
            }

            sb.append("\n");
        }

        System.out.print(sb);
        br.close();
    }
}
