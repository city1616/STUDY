package algo;

import java.io.*;
import java.util.*;

public class _1654_랜선자르기 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int[] wire = new int[K];
        for(int i = 0; i < K; i++) wire[i] = Integer.parseInt(br.readLine());

        Arrays.sort(wire);

        boolean flag = true;
        for(int i = 0; i < K - 1; i++) {
            if(wire[i] != wire[i + 1]) {
                flag = false;
                break;
            }
        }

        long start = 0;
        long end = wire[K - 1];
        long half = 0;
        while(start < end) { // 자를 수 있는 선의 길이의 최대 길이를 찾는다.
            half = (start + end) / 2;
            if(half == 0) break;

            int sum = 0;
            for(int i = 0; i < K; i++) sum += wire[i] / half;

            if(sum < N) end = half; // 원하는 랜선 수보다 잘라진 랜선 수가 적을 경우, 하나의 랜선 길이가 길어서 길이를 더 짧게 만들어야한다. half보다 아래 수
            else start = half + 1; // 원하는 랜선 수보다 잘라진 랜선 수가 많을 경우, 하나의 랜선 길이가 짧아서 더 길게 만들어야한다. half보다 위의 수

//            System.out.println("start : " + start + " end : " + end + " half : " + half);

        }
        if(flag && K == N) System.out.println(wire[0]);
        else System.out.println(start - 1);
        br.close();
    }
}
