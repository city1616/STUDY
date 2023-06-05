package algo;

import java.io.*;
import java.util.*;

public class _10816_숫자카드2 {

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
            int ans = upperBound(num) - lowerBound(num);
//            System.out.println(ans);
            sb.append(ans).append(" ");
        }
        System.out.println(sb);
        br.close();
    }

    static int lowerBound(int num) {
        int min = 0;
        int max = arr.length;

        while(min < max) {
            int half = (min + max) / 2;

            if(num <= arr[half]) max = half;
            else min = half + 1;
        }

        return max;
    }

    static int upperBound(int num) {
        int min = 0;
        int max = arr.length;

        while(min < max) {
            int half = (min + max) / 2;

            if(num < arr[half]) max = half;
            else min = half + 1;
        }
        return min;
    }
}

// -10 -10 2 3 3 6 7 10 10 10