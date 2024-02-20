package algo;

import java.io.*;
import java.util.*;

public class _1208_부분수열의합_2 {

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
            boolean flag = false;
            int sum = 0;
            for(int i = 0; i < N; i++) {
                if(visit[i]) {
                    flag = true;
                    sum += arr[i];
                }
            }
//            System.out.println("sum : " + sum);
            if(sum == S && flag) cnt += 1;
            return;
        }
        visit[depth] = true;
        subs(depth + 1);
        visit[depth] = false;
        subs(depth + 1);
    }
}
