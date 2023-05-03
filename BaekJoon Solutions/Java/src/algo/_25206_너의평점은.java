package algo;

import java.io.*;
import java.util.*;

public class _25206_너의평점은 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        float score_sum = 0;
        float total_sum = 0;

        for(int i = 0; i < 20; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String subject = st.nextToken();
            float score = st.nextToken().charAt(0) - '0';
            String grade = st.nextToken();

            if(grade.charAt(0) == 'P') {
                continue;
            } else if(grade.charAt(0) == 'A') {
                if(grade.charAt(1) == '+') total_sum += score * 4.5;
                else total_sum += score * 4;
            } else if(grade.charAt(0) == 'B') {
                if(grade.charAt(1) == '+') total_sum += score * 3.5;
                else total_sum += score * 3;
            } else if(grade.charAt(0) == 'C') {
                if(grade.charAt(1) == '+') total_sum += score * 2.5;
                else total_sum += score * 2;
            } else if(grade.charAt(0) == 'D') {
                if(grade.charAt(1) == '+') total_sum += score * 1.5;
                else total_sum += score;
            } else {

            }

            score_sum += score;
        }
        float res = total_sum / score_sum;
        System.out.println(String.format("%.6f", res));
        br.close();
    }
}
