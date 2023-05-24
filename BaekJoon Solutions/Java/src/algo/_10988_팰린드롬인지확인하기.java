package algo;

import java.io.*;

public class _10988_팰린드롬인지확인하기 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        int start = 0;
        int end = S.length() - 1;
        boolean flag = true;

        for(int i = 0; i < S.length() / 2; i++) {
            if(S.charAt(start + i) != S.charAt(end - i)) flag = false;
        }

        if(flag) System.out.println(1);
        else System.out.println(0);
        br.close();
    }
}
