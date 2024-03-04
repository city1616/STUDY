package algo;

import java.io.*;
import java.util.*;

public class _1926_그림 {

    static int N, M, max;
    static int[][] image;
    static boolean[][] visit;
    static int[] di = {-1, 0, 1, 0};
    static int[] dj = {0, 1, 0, -1};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        image = new int[N][M];
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for(int j = 0; j < M; j++) {
                image[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        visit = new boolean[N][M];
        int cnt = 0;
        max = 0;
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                if(image[i][j] == 1 && !visit[i][j]) {
                    bfs(i, j);
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
        System.out.println(max);
        br.close();
    }

    static void bfs(int i, int j) {
        ArrayDeque<int[]> q = new ArrayDeque<>();
        visit[i][j] = true;
        q.add(new int[] {i, j});
        int cnt = 1;

        while(!q.isEmpty()) {
            int[] ij = q.poll();
            i = ij[0];
            j = ij[1];
            for(int d = 0; d < 4; d++) {
                int ni = i + di[d];
                int nj = j + dj[d];
                if(ni < 0 || ni >= N || nj < 0 || nj >= M) continue;
                if(visit[ni][nj] || image[ni][nj] == 0) continue;
                visit[ni][nj] = true;
                q.add(new int[] {ni, nj});
                cnt++;
            }
        }
        max = (cnt > max) ? cnt : max;
    }
}
