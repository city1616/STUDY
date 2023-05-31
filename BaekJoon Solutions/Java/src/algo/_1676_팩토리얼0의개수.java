package algo;

import java.io.*;
import java.math.BigDecimal;

public class _1676_팩토리얼0의개수 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        BigDecimal num = new BigDecimal(1);
        for(int i = 1; i <= N; i++) num = num.multiply(BigDecimal.valueOf(i));

//        System.out.println("num : " + num);
        String numS = num.toString();

        int cnt = 0;
        for(int i = numS.length() - 1; i >= 0; i--) {
            if(numS.charAt(i) == '0') cnt++;
            else break;
        }

        System.out.println(cnt);
        br.close();
    }
}
