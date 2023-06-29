package algo;

import java.io.*;
import java.util.*;

public class _18125_고양이사료 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        int[][] map = new int[C][R];
        int[][] student = new int[R][C];

        for(int i = 0; i < C; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for(int j = 0; j < R; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        boolean flag = true;

        for(int i = 0; i < R; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for(int j = 0; j < C; j++) {
                int num = Integer.parseInt(st.nextToken());
                if(map[C - j - 1][i] != num) flag = false;
            }
        }

        if(flag) {
            sb.append("|>___/|        /}").append("\n");
            sb.append("| O < |       / }").append("\n");
            sb.append("(==0==)------/ }").append("\n");
            sb.append("| ^  _____    |").append("\n");
            sb.append("|_|_/     ||__|").append("\n");
        } else {
            sb.append("|>___/|     /}").append("\n");
            sb.append("| O O |    / }").append("\n");
            sb.append("( =0= )\"\"\"\"  \\").append("\n");
            sb.append("| ^  ____    |").append("\n");
            sb.append("|_|_/    ||__|\n").append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}





