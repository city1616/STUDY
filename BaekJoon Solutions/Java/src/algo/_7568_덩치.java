package algo;

import java.io.*;
import java.util.*;

public class _7568_덩치 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][4];

        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
            arr[i][2] = i;
        }

        Arrays.sort(arr, (o1, o2) -> {
            if(o1[0] == o2[0]) return -(o1[1] - o2[1]);
            return -(o1[0] - o2[0]);
        });

        for(int i = 0; i < N; i++) {
            if(i == 0) {
                arr[i][3] = 1;
                continue;
            }
            int cnt = 0;
            for(int now = i - 1; now >= 0; now--) {
                if(arr[now][0] > arr[i][0] && arr[now][1] > arr[i][1]) cnt += 1;
            }
            arr[i][3] = cnt + 1;
        }

        Arrays.sort(arr, (o1, o2) -> {
            return o1[2] - o2[2];
        });

        for(int i = 0; i < N; i++) {
//            System.out.println(arr[i][0] + " " + arr[i][1] + " " + arr[i][2] + " " + arr[i][3]);
            sb.append(arr[i][3]).append(" ");
        }
        System.out.println(sb);
        br.close();
    }
}
