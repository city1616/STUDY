package algo;

import java.io.*;
import java.util.*;

public class _28278_스택_2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        ArrayDeque<Integer> q = new ArrayDeque<>();

        for(int i = 0; i < N; i++) {
            String S = br.readLine();

            int num = 0;
            if(S.length() > 1) {
                StringTokenizer st = new StringTokenizer(S, " ");
                int first = Integer.parseInt(st.nextToken());
                int last = Integer.parseInt(st.nextToken());
                num = 1;
                q.offer(last);
            } else {
                num = Integer.parseInt(S);
                if(num == 2) {
                    if(!q.isEmpty()) {
                        sb.append(q.pollLast()).append("\n");
                    } else {
                        sb.append(-1).append("\n");
                    }
                } else if(num == 3) {
                    sb.append(q.size()).append("\n");
                } else if(num == 4) {
                    if(q.isEmpty()) sb.append(1).append("\n");
                    else sb.append(0).append("\n");
                } else if(num == 5) {
                    if(q.size() == 0) sb.append(-1).append("\n");
                    else {
                        int a = q.pollLast();
                        sb.append(a).append("\n");
                        q.offer(a);
                    }
                }
            }
        }
        System.out.print(sb);
        br.close();
    }
}
