package algo;

import java.io.*;
import java.util.*;

public class _2745_진법변환 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());

        // 'A' = 65
        // '0' = 48

        int res = 0;
        for(int i = N.length() - 1; i >= 0; i--) {
            char c = N.charAt(N.length() - 1 - i);
            if(c - 0 >= 48 && c - 0 <= 57) {
                res += Math.pow(B, i) * (c - '0');
            } else {
                res += Math.pow(B, i) * (c - 55);
            }
        }
        System.out.println(res);
        br.close();
    }
}