package algo;

import java.io.*;

public class _2744_대소문자바꾸기 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();

        String res = "";
        for(int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);

            if(ch >= 65 && ch <= 90) {
                ch += 32;
            } else if(ch >= 97 && ch <= 122) {
                ch -= 32;
            }
            res += ch;
        }

        System.out.println(res);
        br.close();
    }
}
