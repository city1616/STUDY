package algo;

import java.io.*;
import java.util.*;

public class _10815_숫자카드 {

    static int[] card;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        card = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++) card[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(card);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");

        for(int i = 0; i < M; i++) {
            int num = Integer.parseInt(st.nextToken());
            if(binary_search(0, N - 1, num)) sb.append(1);
            else sb.append(0);
            sb.append(" ");
        }

        System.out.println(sb);
        br.close();
    }

    static boolean binary_search(int start, int end, int num) {
        int half = (start + end) / 2;

        if(card[half] == num) return true;
        else if(start >= end) return false;

        if(card[half] > num) return binary_search(start, half, num);
        else return binary_search(half + 1, end, num);
    }
}
