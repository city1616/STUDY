package algo;

import java.io.*;
import java.util.*;

public class _2512_예산 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ans = 0;
        int N = Integer.parseInt(br.readLine()); // 지방의 수

        int[] money = new int[N]; // 각 지방의 예산 요청
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++) money[i] = Integer.parseInt(st.nextToken());

        int M = Integer.parseInt(br.readLine()); // 총 예산

        Arrays.sort(money); // 지방 예산 이분탐색을 위해 오름차순 정렬

        int start = 0;
        int end = money[N - 1];
        int half = 0;
        while(start <= end) {
            half = (start + end) / 2;

            int sum = 0;
            for(int i = 0; i < N; i++) {
                if(money[i] >= half) sum += half;
                else sum += money[i];
            }

//            System.out.println("start : " + start + " end : " + end + " half : " + half + " sum : " + sum);

            if(sum > M) end = half - 1;
            else {
                ans = half;
                start = half + 1;
            }
        }

        System.out.println(ans);
        br.close();
    }
}
