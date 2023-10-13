package algo;

import java.io.*;
import java.util.*;

public class _2720_세탁소사장동혁 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++) {
            int coin = Integer.parseInt(br.readLine());
            int q = coin / 25;
            coin -= 25 * q;
            int d = coin / 10;
            coin -= 10 * d;
            int n = coin / 5;
            coin -= 5 * n;
            int p = coin;
            System.out.println(q + " " + d + " " + n + " " + p);
        }
        br.close();
    }
}
