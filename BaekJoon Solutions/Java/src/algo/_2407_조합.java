package algo;

import java.io.*;
import java.math.BigDecimal;
import java.util.*;

public class _2407_조합 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // N * (N - 1) * (N - 2) * ... * (N - M + 1) / M!

        BigDecimal num1 = new BigDecimal(1);
        BigDecimal num2 = new BigDecimal(1);

//        BigDecimal i = num1.multiply(BigDecimal.valueOf(2));

        for(int i = N; i >= N - M + 1; i--) num1 = num1.multiply(BigDecimal.valueOf(i));
        for(int i = M; i >= 1; i--) num2 = num2.multiply(BigDecimal.valueOf(i));

//        System.out.println("num1 : " + num1);
//        System.out.println("num2 : " + num2);

        BigDecimal res = num1.divide(num2);

        System.out.println(res);
        br.close();
    }
}
