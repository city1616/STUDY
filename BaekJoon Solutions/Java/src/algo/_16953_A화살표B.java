package algo;

import java.io.*;
import java.util.*;

public class _16953_A화살표B {

    static int cnt;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());

        cnt = -1;
        cal(A, B, 1);

        if(cnt == -1) System.out.println(-1);
        else System.out.println(cnt);
        br.close();
    }

    static void cal(long A, long B, int count) {
        if(A == B) {
            cnt = count;
            return;
        } else if(A > B) {
            return;
        }

        cal(A * 2, B, count + 1);
        cal(A * 10 + 1, B, count + 1);
    }
}
