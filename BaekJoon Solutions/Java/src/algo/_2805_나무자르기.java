package algo;

import java.io.*;
import java.util.*;

public class _2805_나무자르기 { // 매개변수 탐색(Parametric Search)

    static int N, M, ans;
    static int[] tree;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        tree = new int[N];
        st = new StringTokenizer(br.readLine(), " ");

        for(int i = 0; i < N; i++) tree[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(tree);

        int start = 0;
        int end = tree[N - 1];
        int half = 0;
        while(start < end) {
            half = (start + end) / 2;
            if(start == half || end == half) break;

            long sum = 0;
            for(int i = 0; i < N; i++) {
                if(tree[i] > half) sum += tree[i] - half;
            }
            if(sum == M) break;

            if(sum > M) start = half;
            else if(sum < M) end = half;
        }

        System.out.println(half);
        br.close();
    }
}
