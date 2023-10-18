package algo;

import java.io.*;
import java.util.*;

public class _10866_덱 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        ArrayDeque<Integer> q = new ArrayDeque<>();
        StringTokenizer st;

        for(int i = 0; i < N; i++) {
            String S = br.readLine();

            if(S.contains("push_front")) {
                st = new StringTokenizer(S, " ");
                st.nextToken();
                q.offerFirst(Integer.parseInt(st.nextToken()));
            } else if(S.contains("push_back")) {
                st = new StringTokenizer(S, " ");
                st.nextToken();
                q.offer(Integer.parseInt(st.nextToken()));
            } else if(S.contains("pop_front")) {
                if(q.isEmpty()) sb.append(-1).append("\n");
                else sb.append(q.poll()).append("\n");
            } else if(S.contains("pop_back")) {
                if(q.isEmpty()) sb.append(-1).append("\n");
                else sb.append(q.pollLast()).append("\n");
            } else if(S.contains("size")) {
                sb.append(q.size()).append("\n");
            } else if(S.contains("empty")) {
                if(q.isEmpty()) sb.append(1).append("\n");
                else sb.append(0).append("\n");
            } else if(S.contains("front")) {
                if(q.isEmpty()) sb.append(-1).append("\n");
                else sb.append(q.peekFirst()).append("\n");
            } else if(S.contains("back")) {
                if(q.isEmpty()) sb.append(-1).append("\n");
                else sb.append(q.peekLast()).append("\n");
                q.peek();
            }
        }
        System.out.print(sb);
        br.close();
    }
}
