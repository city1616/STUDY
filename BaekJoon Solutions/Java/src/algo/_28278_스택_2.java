package algo;

import java.io.*;
import java.util.*;

public class _28278_스택_2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        ArrayDeque<Integer> q = new ArrayDeque<>();
        for(int i = 0; i < N; i++) {
            String S = br.readLine();
            if(S.length() > 1) {
                StringTokenizer st = new StringTokenizer(S, " ");
                int first = Integer.parseInt(st.nextToken());
                int last = Integer.parseInt(st.nextToken());
                q.offer(last);
            }

            int num = Integer.parseInt(S);
            if(num == 2) {

            } else if(num == 3) {

            } else if(num == 4) {

            } else if(num == 5) {
                
            }
        }
    }
}
