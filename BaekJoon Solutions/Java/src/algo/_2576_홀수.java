package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _2576_홀수 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int min = 101;
        boolean flag = false;

        for(int i = 0; i < 7; i++) {
            int number = Integer.parseInt(br.readLine());
            if(number % 2 == 0) continue;
            flag = true;
            sum += number;
            min = Math.min(min, number);
        }
        if(flag) {
            System.out.println(sum);
            System.out.println(min);
        } else {
            System.out.println(-1);
        }

        br.close();
    }
}
