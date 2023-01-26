import java.io.*;
import java.util.*;

public class _15654_N과M_5 {

    static int N, M;
    static int[] a, b;
    static boolean[] visit;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        a = new int[N];
        b = new int[M];
        visit = new boolean[N];
        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++) a[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(a);
        // System.out.println(Arrays.toString(a));

        perm(0);
        System.out.print(sb);
        br.close();
    }

    static void perm(int depth) {
        if (depth == M) {
            for(int i : b) {
                sb.append(i).append(" ");
            }
            sb.append("\n");
            return;
        }
        for(int i = 0; i < N; i++) {
            if(!visit[i]) {
                visit[i] = true;
                b[depth] = a[i];
                perm(depth + 1);
                visit[i] = false;
            }
        }
    }
}
