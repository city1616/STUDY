import java.io.*;
import java.util.*;

public class _12852_1로만들기_2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] dp = new int[N + 1];
        int[] path = new int[N + 1];

        Arrays.fill(dp, Integer.MAX_VALUE);

        dp[1] = 0;
        for(int start = 2; start <= N; start++) {
            if(start % 3 == 0 && dp[start] > dp[start / 3] + 1) {
                dp[start] = dp[start / 3] + 1;
                path[start] = start / 3;
            }

            if(start % 2 == 0 && dp[start] > dp[start / 2] + 1) {
                dp[start] = dp[start / 2] + 1;
                path[start] = start / 2;
            }

            if(dp[start - 1] + 1 < dp[start]) {
                dp[start] = dp[start - 1] + 1;
                path[start] = start - 1;
            }
        }

        sb.append(dp[N]).append("\n");
        while(N > 0) {
            sb.append(N).append(" ");
            N = path[N];
        }

//        System.out.println(Arrays.toString(dp));
        System.out.println(sb);
        br.close();
    }
}
