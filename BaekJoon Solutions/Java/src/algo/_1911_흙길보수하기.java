package algo;

import java.io.*;
import java.util.*;

public class _1911_흙길보수하기 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        int[][] arr = new int[N][2];
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, (o1, o2) -> {
            if(o1[0] == o2[0]) {
                return o1[1] - o2[1];
            } else {
                return o1[0] - o2[0];
            }
        });
        
//        for(int i = 0; i < N; i++) System.out.println(Arrays.toString(arr[i]));
        int cnt = 0;
        int temp = 0;
        for(int i = 0; i < N; i++) {
            if (arr[i][0] > temp) {
                temp = arr[i][0];
            }
            if (arr[i][1] > temp) {
                while (arr[i][1] > temp) {
                    temp += L;
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
        br.close();
    }
}
