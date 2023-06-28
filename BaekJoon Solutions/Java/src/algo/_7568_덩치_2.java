package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _7568_덩치_2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][3];

        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < N; i++) {
            int cnt = 0;
            for(int j = 0; j < N; j++) {
                if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) cnt++;
            }
            arr[i][2] = cnt + 1;
        }

        for(int i = 0; i < N; i++) {
            sb.append(arr[i][2]).append(" ");
        }
        System.out.println(sb);
        br.close();
    }
}
