package algo;

import java.io.*;

public class _9095_123_더하기 {

    static int ans;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for(int tc = 0; tc < T; tc++) {
            int N = Integer.parseInt(br.readLine());
            ans = 0;
            cal(0, N);

            sb.append(ans).append("\n");
        }

        System.out.print(sb);
        br.close();
    }

    static void cal(int cnt, int N) {
        if(cnt > N) return;

        if(cnt == N) {
            ans += 1;
            return;
        }
        cal(cnt + 1, N);
        cal(cnt + 2, N);
        cal(cnt + 3, N);
    }
}
