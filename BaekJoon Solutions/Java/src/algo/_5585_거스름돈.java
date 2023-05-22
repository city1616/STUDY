package algo;

import java.io.*;

public class _5585_거스름돈 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int money = 1000 - Integer.parseInt(br.readLine());
        int[] coin = {500, 100, 50, 10, 5, 1};

        int cnt = 0;
        int i = 0;
        while(money != 0) {
            cnt += money / coin[i];
            money -= coin[i] * (money / coin[i]);
            i++;
        }
        System.out.println(cnt);
        br.close();
    }
}
