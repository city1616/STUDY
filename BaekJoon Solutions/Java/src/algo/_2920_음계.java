package algo;

import java.io.*;
import java.util.*;

public class _2920_음계 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] arr = new int[8];
        for(int i = 0; i < 8; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        boolean up = false;
        boolean down = false;
        for(int i = 0; i < 7; i++) {
            if(arr[i] + 1 == arr[i + 1]) up = true;
            else {
                up = false;
                break;
            }
        }

        for(int i = 0; i < 7; i++) {
            if(arr[i] - 1 == arr[i + 1]) down = true;
            else {
                down = false;
                break;
            }
        }

        if(up) System.out.println("ascending");
        else if(down) System.out.println("descending");
        else System.out.println("mixed");
        br.close();
    }
}
