package algo;

import java.io.*;
import java.util.*;

public class _14215_세막대 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[3];
        for(int i = 0; i < 3; i++) arr[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(arr);

        while(arr[2] >= arr[1] + arr[0]) arr[2] -= 1;

        System.out.println(arr[0] + arr[1] + arr[2]);
        br.close();
    }
}
