package algo;

import java.io.*;

public class _2523_별찍기_13 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        String ch = "*";

        for(int i = 1; i < N + 1; i++) {
            for(int j = 0; j < i; j++) sb.append(ch);
            sb.append("\n");
        }

        for(int i = N - 1; i > 0; i--) {
            for(int j = 0; j < i; j++) sb.append(ch);
            sb.append("\n");
        }
        System.out.print(sb);
        br.close();
    }
}
