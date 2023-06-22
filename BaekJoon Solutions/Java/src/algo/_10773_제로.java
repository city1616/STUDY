package algo;

import java.io.*;
import java.util.*;

public class _10773_제로 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int ans = 0;
        ArrayDeque<Integer> q = new ArrayDeque<>();

        for(int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            if(num != 0) {
                q.add(num);
            } else {
                q.pollLast();
            }
        }

        while(!q.isEmpty()) ans += q.poll();

        System.out.println(ans);
        br.close();
    }
}
