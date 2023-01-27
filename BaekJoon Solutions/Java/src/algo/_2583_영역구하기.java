import java.io.*;
import java.util.*;

public class _2583_영역구하기 {

    static int N, M, cnt;
    static ArrayList<Integer> ans;
    static int[][] map;
    static int[] di = {0, 1, 0, -1};
    static int[] dj = {1, 0, -1, 0};
    static boolean[][] visit;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        map = new int[N][M];
        for(int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());

            for(int n = b; n < d; n++) {
                for(int m = a; m < c; m++) {
                    map[n][m] = 1;
                }
            }
        }

        // for(int i = 0; i < N; i++) System.out.println(Arrays.toString(map[i]));

        ans = new ArrayList<>();
        visit = new boolean[N][M];
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                if(map[i][j] == 1 || visit[i][j]) continue;
                cnt = 0;
                dfs(i, j);
                ans.add(cnt);
            }
        }

		Collections.sort(ans);
        sb.append(ans.size()).append("\n");
        for(int i : ans) sb.append(i).append(" ");
        System.out.println(sb);
        br.close();
    }

    static void dfs(int i, int j) {
        visit[i][j] = true;
        cnt++;
        for(int d = 0; d < 4; d++) {
            int ni = i + di[d];
            int nj = j + dj[d];
            if(ni < 0 || ni >= N || nj < 0 || nj >= M) continue;
            if(visit[ni][nj] || map[ni][nj] == 1) continue;
            dfs(ni, nj);
        }
    }
}
