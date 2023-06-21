package algo;

import java.io.*;
import java.util.*;

public class _10828_스택 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        ArrayDeque<Integer> q = new ArrayDeque<>();
        for(int i = 0; i < N; i++) {
            String S = br.readLine();
            if(S.equals("pop")) {
                if(q.isEmpty()) sb.append("-1").append("\n");
                else sb.append(q.pollLast()).append("\n");
            } else if(S.equals("size")) {
                sb.append(q.size()).append("\n");
            } else if(S.equals("empty")) {
                if(q.isEmpty()) sb.append(1).append("\n");
                else sb.append(0).append("\n");
            } else if(S.equals("top")) {
                if(q.isEmpty()) sb.append("-1").append("\n");
                else sb.append(q.peekLast()).append("\n");
            } else {
                StringTokenizer st = new StringTokenizer(S, " ");
                String command = st.nextToken();
                int num = Integer.parseInt(st.nextToken());

                q.add(num);
            }
        }
        System.out.print(sb);
        br.close();
    }
}
