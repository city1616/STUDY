package algo;

import java.io.*;
import java.util.*;

public class _10824_네수 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        long num1 = Long.parseLong(st.nextToken() + st.nextToken());
        long num2 = Long.parseLong(st.nextToken() + st.nextToken());
        System.out.println(num1 + num2);
        br.close();
    }
}
