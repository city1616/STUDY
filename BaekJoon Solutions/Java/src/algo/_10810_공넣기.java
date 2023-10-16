package algo;

import java.io.*;
import java.util.*;

public class _10810_공넣기 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N + 1];
        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            for(int j = a; j < b + 1; j++) {
                arr[j] = c;
            }
        }
        for(int i = 1; i < N + 1; i++) sb.append(arr[i]).append(" ");
        System.out.println(sb);
        br.close();
    }
}
