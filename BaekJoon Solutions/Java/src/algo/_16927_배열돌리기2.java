package algo;

import java.io.*;
import java.util.*;

public class _16927_배열돌리기2 {

    static int[][] arr;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

        arr = new int[N][M];
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for(int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

//        for(int i = 0; i < N; i++) System.out.println(Arrays.toString(arr[i]));

        rotate(N, M, 0, R, N, M);

//        System.out.println("---------------------------------------");
//        for(int i = 0; i < N; i++) System.out.println(Arrays.toString(arr[i]));
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                sb.append(arr[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
        br.close();
    }

    static void rotate(int n, int m, int start, int r, int a, int b) {
        int time =  (a - 1) * 2 + (b - 1) * 2;
        int cnt = r % time;
//        System.out.println("cnt : " + cnt);
        for(int t = 0; t < cnt; t++) {
            int tmp = arr[n - 1][start];
            for(int i = n - 1; i > start; i--) arr[i][start] = arr[i - 1][start];
            for(int i = start; i < m - 1; i++) arr[start][i] = arr[start][i + 1];
            for(int i = start; i < n - 1; i++) arr[i][m - 1] = arr[i + 1][m - 1];
            for(int i = m - 1; i > start; i--) arr[n - 1][i] = arr[n - 1][i - 1];
            arr[n - 1][start + 1] = tmp;
        }
        if(a / 2 >= 2 && b / 2 >= 2) rotate(n - 1, m - 1, start + 1, r, a - 2, b - 2);
    }
}
