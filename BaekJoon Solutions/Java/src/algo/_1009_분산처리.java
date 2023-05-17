package algo;

import java.io.*;
import java.util.*;

public class _1009_분산처리 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int temp = 1;
            for(int j = 0; j < b; j++) {
                temp = temp * a % 10;
            }
            if(temp == 0) sb.append(10).append("\n");
            else sb.append(temp).append("\n");
        }
        System.out.print(sb);
        br.close();
    }
}
