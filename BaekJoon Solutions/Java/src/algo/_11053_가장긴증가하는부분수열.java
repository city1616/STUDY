package algo;

import java.io.*;
import java.util.*;

public class _11053_가장긴증가하는부분수열 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        int max = 0;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());

        int[] dp = new int[N];
        for(int i = 0; i < N; i++) {
            dp[i] = 1; // 모든 부분수열의 길이는 최소 1 이상

            for(int j = 0; j < i; j++) { // 처음부터 자기 자신 이전까지 탐색
                if(arr[j] < arr[i] && dp[i] < dp[j] + 1) { // 자기 자신보다 크고 dp에 하나 증가한 값이 더 큰 곳 탐색
                    dp[i] = dp[j] + 1;
                }
            }
        }

//        System.out.println(Arrays.toString(dp));

        for(int i = 0; i < N; i++) {
            max = max < dp[i] ? dp[i] : max;
        }


        System.out.println(max);
        br.close();
    }
}
