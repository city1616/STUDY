package algo;

import java.io.*;
import java.util.*;

public class _11725_트리의부모찾기 {

    static int N;
    static List<Integer>[] g;
    static boolean[] visit;
    static int[] parents;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());
        parents = new int[N];

        g = new List[N]; // 헤더들의 집합
        for(int i = 0; i < N; i++) g[i] = new ArrayList<>();


        for(int i = 0; i < N - 1; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int from = Integer.parseInt(st.nextToken()) - 1;
            int to = Integer.parseInt(st.nextToken()) - 1;
            g[from].add(to);
            g[to].add(from);
        }

        for(int i = 0; i < N; i++) parents[i] = -1;
        parents[0] = 0;

        visit = new boolean[N];
        dfs(0);
//        System.out.println(Arrays.toString(parents));
        for(int i = 1; i < N; i++) sb.append(parents[i] + 1).append("\n");
        System.out.print(sb);
        br.close();
    }

    static void dfs(int i) {
        visit[i] = true;
        for(int j : g[i]) {
            if(parents[j] == -1) parents[j] = i;
            if(visit[j]) continue;
            dfs(j);
        }
    }
}
