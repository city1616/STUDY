package algo;

import java.io.*;
import java.util.*;

public class _2587_대표값2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[5];
        int sum = 0;
        for(int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }
        System.out.println(sum / 5);
        Arrays.sort(arr);
        System.out.println(arr[2]);
    }
}
