package algo;

import java.io.*;

public class _2446_별찍기_9 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < i; j++) sb.append(" ");
            for(int j = 0; j < (N - i) * 2 - 1; j++) sb.append("*");
            sb.append("\n");
        }
        for(int i = N - 1; i > 0; i--) {
            for(int j = 0; j < i - 1; j++) sb.append(" ");
            for(int j = 0; j < (N - i) * 2 + 1; j++) sb.append("*");
            sb.append("\n");
        }
        System.out.print(sb);
        br.close();
    }
}
