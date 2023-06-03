package algo;

import java.io.*;
import java.util.*;

public class _9063_대지 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[][] arr = new int[2][2];
        arr[0][0] = 10000;
        arr[0][1] = -10000;
        arr[1][0] = 10000;
        arr[1][1] = -10000;

        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            if(x < arr[0][0]) arr[0][0] = x;
            if(x > arr[0][1]) arr[0][1] = x;
            if(y < arr[1][0]) arr[1][0] = y;
            if(y > arr[1][1]) arr[1][1] = y;
        }

//        for(int i = 0; i < 2; i++) System.out.println(Arrays.toString(arr[i]));

        System.out.println((arr[0][1] - arr[0][0]) * (arr[1][1] - arr[1][0]));
        br.close();
    }
}
