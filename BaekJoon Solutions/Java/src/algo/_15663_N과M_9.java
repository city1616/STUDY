import java.io.*;
import java.util.*;

public class _15663_N과M_9 {

    static int N, M;
    static int[] arr, res;
    static HashSet<String> set = new HashSet<>();
    static boolean[] visit;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N];
        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());

        res = new int[M];
        visit = new boolean[N];

        perm(0);

        String[] resultArr = set.toArray(new String[0]);

        int[][] answer = new int[resultArr.length][M];

        for(int i = 0; i < resultArr.length; i++) {
            int[] tmp = new int[M];
            st = new StringTokenizer(resultArr[i], " ");
            for(int j = 0; j < M; j++) tmp[j] = Integer.parseInt(st.nextToken());
            answer[i] = tmp;
        }

        Arrays.sort(answer, ((o1, o2) -> {
            int idx = -1;
            for(int i = 0; i < M; i++) {
                if(o1[i] != o2[i]) {
                    idx = i;
                    break;
                }
            }
            return o1[idx] - o2[idx];
        }));

        for(int i = 0; i < answer.length; i++) {
//            System.out.println(Arrays.toString(answer[i]));
            for(int j = 0; j < M; j++) {
                sb.append(answer[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
        br.close();
    }

    static void perm(int depth) {
        if(depth == M) {
            String tmp = "";
            for(int i = 0; i < res.length; i++) {
                tmp += res[i];
                tmp += " ";
            }
            set.add(tmp);
            return;
        }

        for(int i = 0; i < N; i++) {
            if(!visit[i]) {
                visit[i] = true;
                res[depth] = arr[i];
                perm(depth + 1);
                visit[i] = false;
            }
        }
    }
}
