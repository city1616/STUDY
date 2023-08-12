package algo;

import java.io.*;
import java.util.*;

public class _11866_요세푸스_문제_0 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        ArrayDeque<Integer> q = new ArrayDeque<>();
        for(int i = 1; i <= N; i++) {
            q.offer(i);
        }
        sb.append("<");
        int cnt = 0;
        while(!q.isEmpty()) {
            cnt += 1;
            int now = q.poll();
            if(cnt % K == 0) {
                sb.append(now);
                if(q.size() != 0) sb.append(", ");
            } else {
                q.offer(now);
            }
        }
        sb.append(">");
        System.out.println(sb);
        br.close();
    }
}
