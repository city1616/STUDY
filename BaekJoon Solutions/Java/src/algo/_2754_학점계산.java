package algo;

import java.io.*;

public class _2754_학점계산 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String score = br.readLine();
        float res = 0;
        boolean flag = true;

        if(score.charAt(0) == 'A') {
            res += 4.0;
        } else if(score.charAt(0) == 'B') {
            res += 3.0;
        } else if(score.charAt(0) == 'C') {
            res += 2.0;
        } else if(score.charAt(0) == 'D') {
            res += 1.0;
        } else if(score.charAt(0) == 'F') {
            res += 0.0;
            flag = false;
        }

        if(flag) {
            if(score.charAt(1) == '+') {
                res += 0.3;
            } else if(score.charAt(1) == '0') {
                res += 0.0;
            } else if(score.charAt(1) == '-') {
                res -= 0.3;
            }
        }

        System.out.println(res);
        br.close();
    }
}
