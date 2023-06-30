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
            st = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(st.nextToken());    // 문서의 개수
            int find = Integer.parseInt(st.nextToken()); // 몇번째에 놓여 있는지를 나타내는 정수

            ArrayDeque<Integer> q = new ArrayDeque<>();
            int max = 0;
            st = new StringTokenizer(br.readLine(), " ");
            for(int i = 0; i < N; i++) {
                int num = Integer.parseInt(st.nextToken());
                q.offer(num);
                if(num > max) max = num;
                if(i == find) find = num;
            }

            while(true) {
                int now = q.poll();
                if(now == find)
            }

        }
        System.out.print(sb);
        br.close();
    }
}
