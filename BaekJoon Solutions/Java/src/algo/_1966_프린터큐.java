package algo;

import java.io.*;
import java.util.*;

public class _1966_프린터큐 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        for(int tc = 0; tc < T; tc++) {
            System.out.println("test case : " + tc);
            st = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(st.nextToken());    // 문서의 개수
            int idx = Integer.parseInt(st.nextToken()); // 몇번째에 놓여 있는지를 나타내는 정수
            int val = 0;
            int cnt = 0;

            ArrayDeque<Integer> q = new ArrayDeque<>();
            st = new StringTokenizer(br.readLine(), " ");
            for(int i = 0; i < N; i++) {
                int num = Integer.parseInt(st.nextToken());
                q.offer(num);
                if(i == idx) val = num;
            }


            while(true) {
                int m_idx = 0;
                int m_max = 0;

                for(int i = 0; i < q.size(); i++) {
                    int now = q.poll();

                    if(now > m_max && now >= val) {
                        m_idx = i;
                        m_max = now;
                        System.out.println("idx : " + idx + " m_idx : " + m_idx + " m_max : " + m_max);
                    }
                    q.offer(now);
                }
                int qSize = q.size();
                for(int i = 0; i < qSize; i++) {
                    int out = q.poll();
                    if(i == m_idx) {
                        System.out.println("out : " + out);
                        break;
                    }
                    q.offer(out);
                }

                cnt += 1;
                if(idx == m_idx) break;

                idx -= 1;
                if(idx < 0) idx = q.size() - 1;
            }

            sb.append(cnt).append("\n");

        }
        System.out.print(sb);
        br.close();
    }
}
