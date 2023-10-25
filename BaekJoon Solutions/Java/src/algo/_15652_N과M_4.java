package algo;

import java.io.*;
import java.util.*;

public class _15652_N과M_4 {

    static int N, M;
    static int[] a, b;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        a = new int[N];
        b = new int[M];
        for(int i = 0; i < N; i++) a[i] = i + 1;

        perm(0);
        System.out.print(sb);
    }

    static void perm(int depth) {
        if(depth == M) {
            for(int i : b) sb.append(i).append(" ");
            sb.append("\n");
            return;
        }

        for(int i = 0; i < N; i++) {
            if(depth == 0) {
                b[depth] = a[i];
            } else {
                if(b[depth - 1] <= a[i]) {
                    b[depth] = a[i];
                } else {
                    continue;
                }
            }
            perm(depth + 1);
        }
    }
}
