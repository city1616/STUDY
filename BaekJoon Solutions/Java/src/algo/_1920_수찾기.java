package algo;

import java.io.*;
import java.util.*;

public class _1920_수찾기 {

    static int[] arr;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(arr);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < M; i++) {
            int num = Integer.parseInt(st.nextToken());
            if(find(num)) sb.append(1);
            else sb.append(0);
            sb.append("\n");
        }
        System.out.print(sb);
        br.close();
    }

    static boolean find(int num) {
        int min = 0;
        int max = arr.length;
        boolean flag = false;

        while(min < max) {
            int half = (min + max) / 2;

            if(arr[half] == num) flag = true;

            if(num <= arr[half]) max = half;
            else min = half + 1;
        }
        return flag;
    }
}

// 1 2 3 4 5
