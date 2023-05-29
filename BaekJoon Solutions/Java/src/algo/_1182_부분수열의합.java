package algo;

import java.io.*;
import java.util.*;

public class _1182_부분수열의합 {

    static int N, S, cnt;
    static int[] arr;
    static boolean[] visit;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());

        arr = new int[N];
        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());

        cnt = 0;
        visit = new boolean[N];
        subs(0);

        System.out.println(cnt);
        br.close();
    }

    static void subs(int depth) {
        if(depth == N) {
            int sum = 0;
            boolean flag = false;
            for(int i = 0; i < N; i++) {
                if(visit[i]) {
                    sum += arr[i];
                    flag = true;

                }
            }

            if(flag && sum == S) cnt++;
            return;
        }

        visit[depth] = true;
        subs(depth + 1);
        visit[depth] = false;
        subs(depth + 1);
    }
}
