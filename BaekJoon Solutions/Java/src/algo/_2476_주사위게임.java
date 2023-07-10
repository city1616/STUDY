package algo;

import java.io.*;
import java.util.*;

public class _2476_주사위게임 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int ans = Integer.MIN_VALUE;

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            int num3 = Integer.parseInt(st.nextToken());

            int res = 0;

            if(num1 == num2 && num2 == num3) {
                res += 10000;
                res += num1 * 1000;
            } else if(num1 != num2 && num1 != num3 && num2 != num3) {
                int temp = Math.max(num1, num2);
                res += Math.max(temp, num3) * 100;
            } else {
                res += 1000;
                if(num1 == num2) {
                    res += num1 * 100;
                } else if(num1 == num3) {
                    res += num1 * 100;
                } else if(num2 == num3) {
                    res += num2 * 100;
                }
            }

            ans = Math.max(ans, res);
        }
        System.out.println(ans);
        br.close();
    }
}
