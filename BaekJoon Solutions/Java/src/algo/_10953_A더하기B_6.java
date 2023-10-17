package algo;

import java.io.*;

public class _10953_A더하기B_6 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++) {
            String S = br.readLine();
            sb.append(S.charAt(0) + S.charAt(2) - 96).append("\n");
        }
        System.out.print(sb);
    }
}
