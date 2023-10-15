package algo;

import java.io.*;
import java.util.*;

public class _5073_삼각형과세변 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        while(true) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if(a == 0 && b == 0 && c == 0) break;

            boolean flag = true;

            if(a >= b && a >= c) {
                if(a >= b + c) flag = false;
            } else if(b >= a && b >= c) {
                if(b >= a + c) flag = false;
            } else if(c >= a && c >= b) {
                if(c >= a + b) flag = false;
            }

            if(!flag) {
                sb.append("Invalid").append("\n");
                continue;
            }

            if(a == b && b == c && a == c) sb.append("Equilateral").append("\n");
            else if(a != b && a != c && b != c) sb.append("Scalene").append("\n");
            else sb.append("Isosceles").append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}
