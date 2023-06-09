package algo;

import java.io.*;

public class _9095_123_더하기_dp {

    static int ans;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for(int tc = 0; tc < T; tc++) {
            int N = Integer.parseInt(br.readLine());
            int[] dp = new int[11];

            dp[1] = 1;
            dp[2] = 2;
            dp[3] = 4;

            for(int i = 4; i <= N; i++) {
                dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3]; // 점화식
            }

            sb.append(dp[N]).append("\n");
        }
        System.out.print(sb);
        br.close();
    }
}
