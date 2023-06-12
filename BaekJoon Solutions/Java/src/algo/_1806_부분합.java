package algo;

import java.io.*;
import java.util.*;

public class _1806_부분합 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());

        int start = 0;
        int end = 0;
        int sum = arr[0];
        int ans = Integer.MAX_VALUE;

        while(true) {
            if(sum >= S) ans = Math.min(ans, end - start + 1);
            if(end == N - 1 && sum < S) break;

            if(sum < S || start == end) {
                end += 1;
                if(end < N) sum += arr[end];
            } else {
                sum -= arr[start];
                start += 1;
            }
            if(end >= N) break;
        }

        if(ans == Integer.MAX_VALUE) System.out.println(0);
        else System.out.println(ans);
        br.close();
    }
}
