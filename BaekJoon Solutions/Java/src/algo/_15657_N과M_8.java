package algo;

import java.io.*;
import java.util.*;

public class _15657_N과M_8 {

    static int N, M;
    static int[] arr, res;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N];
        res = new int[N];

        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        perm(0, 0);

        System.out.print(sb);
        br.close();
    }

    static void perm(int depth, int start) {
        if(depth == M) {
            for(int i = 0; i < M; i++) {
                sb.append(res[i]).append(" ");
            }
            sb.append("\n");
            return;
        }
        for(int i = start; i < N; i++) {
            res[depth] = arr[i];
            perm(depth + 1, i);
        }
    }
}
