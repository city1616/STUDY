package algo;

import java.io.*;
import java.util.*;

public class _15666_N과M_12 {

    static int N, M;
    static int[] arr, res;
    static Set<String> set = new LinkedHashSet<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N];
        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(arr);

        res = new int[M];
        homo(0, 0);

//        System.out.println("set size : " + set.size());
        String[] answer = set.toArray(new String[0]);
//        System.out.println(Arrays.toString(answer));
        for(String str : answer) sb.append(str).append("\n");
        System.out.print(sb);
        br.close();
    }

    static void homo(int depth, int start) {
        if(depth == M) {
//            System.out.println(Arrays.toString(res));
            String temp = "";
            for(int i = 0; i < M; i++) temp += res[i] + " ";
            set.add(temp);
            return;
        }

        for(int i = start; i < N; i++) {
            res[depth] = arr[i];
            homo(depth + 1, i);
        }
    }
}
