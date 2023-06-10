package algo;

import java.io.*;
import java.util.*;

public class _15964_이상한기호 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());

        long res = cal(A, B);
        System.out.println(res);
        br.close();
    }

    static long cal(long A, long B) {
        long res = (A + B) * (A - B);
        return res;
    }
}
