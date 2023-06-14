package algo;

import java.io.*;

public class _11719_그대로출력하기2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String line = "";
        while((line = br.readLine()) != null) {
            sb.append(line).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}
