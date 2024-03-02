package algo;

import java.io.*;
import java.util.*;

public class _1495_기타리스트 {

    static int N, S, M, ans;
    static int[] arr;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N];
        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0;  i < N; i++) arr[i] = Integer.parseInt(st.nextToken());

        ans = -1;

        // 행 index : 연주해야될 인덱스, 열 index : 현재 볼륨
        boolean[][] dp = new boolean[N][M + 1];
        if(S - arr[0] >= 0) dp[0][S - arr[0]] = true;
        if(S + arr[0] <= M) dp[0][S + arr[0]] = true;

        for(int i = 0; i < N - 1; i++) {
            for(int j = 0; j <= M; j++) {
                if(!dp[i][j]) continue;
                if(j - arr[i + 1] >= 0) dp[i + 1][j - arr[i + 1]] = true; // 점화식
                if(j + arr[i + 1] <= M) dp[i + 1][j + arr[i + 1]] = true; // 점화식
            }
        }

        // 마지막 연주가 끝난 후 마지막 행에서 값이 true인 가장 큰 열 인덱스를 구한다.
        for(int i = 0; i <= M; i++) {
            if(dp[N - 1][i] && i > ans) ans = i;
        }

        System.out.println(ans);
        br.close();
    }
}
