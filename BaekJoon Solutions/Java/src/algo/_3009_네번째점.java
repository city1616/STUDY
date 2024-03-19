package algo;

import java.io.*;
import java.util.*;

public class _3009_네번째점 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        int e = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());

        if(a == c) sb.append(e);
        else {
            if(a == e) sb.append(c);
            else sb.append(a);
        }
        sb.append(" ");
        if(b == d) sb.append(f);
        else {
            if(b == f) sb.append(d);
            else sb.append(b);
        }
        System.out.println(sb);
        br.close();
    }
}
