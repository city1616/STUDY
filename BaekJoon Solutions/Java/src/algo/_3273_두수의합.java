package algo;

import java.io.*;
import java.util.*;

public class _3273_두수의합 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(arr);
//        Arrays.parallelSort(arr);

        int K = Integer.parseInt(br.readLine());
        int cnt = 0;
        int start = 0;
        int end = N - 1;
        int sum = 0;

        while(start < end) {
            sum = arr[start] + arr[end];
            if(sum == K) cnt++;

            if(sum <= K) start++;
            else end--;
        }

        System.out.println(cnt);
        br.close();
    }
}
