package algo;

import java.io.*;
import java.util.*;

public class _1495_기타리스트 {

    static int N, S, M, ans;
    static int[] arr;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N];
        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0;  i < N; i++) arr[i] = Integer.parseInt(st.nextToken());

        ans = -1;
        vol(0, S);
        System.out.println(ans);
        br.close();
    }

    static void vol(int i, int now) {
        if(i >= N) {
            ans = Math.max(ans, now);
            return;
        }
        if(now + arr[i] <= M) vol(i + 1, now + arr[i]);
        if(now - arr[i] >= 0) vol(i + 1, now - arr[i]);
    }
}
