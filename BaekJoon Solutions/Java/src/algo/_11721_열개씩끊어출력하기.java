package algo;

import java.io.*;
import java.util.*;

public class _11721_열개씩끊어출력하기 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();

        String ans = "";
        for(int i = 0; i < S.length(); i++) {
            ans += S.charAt(i);
            if((i + 1) % 10 == 0) {
                System.out.println(ans);
                ans = "";
            }
        }
        System.out.println(ans);
        br.close();
    }
}
