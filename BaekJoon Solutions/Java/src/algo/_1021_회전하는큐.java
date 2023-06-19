package algo;

import java.io.*;
import java.util.*;

public class _1021_회전하는큐 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int ans = 0;

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        ArrayDeque<Integer> q = new ArrayDeque<>();
        for(int i = 0; i < N; i++) q.offer(i + 1);

        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < M; i++) {
            int num = Integer.parseInt(st.nextToken());

            int cnt = 0;

            while(true) {
                int now = q.poll();

                if(now == num) break;
                cnt += 1;
                q.offer(now);
            }
            int qSize = q.size() + 1;
            if(cnt > qSize / 2) cnt = qSize - cnt;

            ans += cnt;
//            System.out.println("q size : " + q.size() + " cnt : " + cnt + " ans : " + ans);
        }
        System.out.println(ans);
        br.close();
    }
}
