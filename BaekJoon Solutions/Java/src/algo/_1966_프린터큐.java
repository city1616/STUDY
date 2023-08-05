package algo;

import java.io.*;
import java.util.*;

public class _1966_프린터큐 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        for(int tc = 0; tc < T; tc++) {
//            System.out.println("test case : " + tc);
            st = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(st.nextToken());    // 문서의 개수
            int idx = Integer.parseInt(st.nextToken()); // 몇번째에 놓여 있는지를 나타내는 정수
            int val = 0;
            int cnt = 0;

            LinkedList<int[]> q = new LinkedList<>();
            st = new StringTokenizer(br.readLine(), " ");
            for(int i = 0; i < N; i++) {
                int num = Integer.parseInt(st.nextToken());
                q.add(new int[] {i, num});
            }

            while(!q.isEmpty()) {
                int[] temp = q.poll();
                boolean check = true;

                // 자기보다 큰 값이 있다면 뒤로 넘기기
                for(int i = 0; i < q.size(); i++) {
                    if(temp[1] < q.get(i)[1]) {
                        q.add(temp);
                        for(int j = 0; j < i; j++) {
                            q.add(q.poll());
                        }
                        check = false;
                        break;
                    }
                }

                // 만약에 front에 가장 큰 값이 아니라면 다시 반복
                if(check == false) continue;

                // 만약 최고값이라면 poll했으니 count를 추가
                cnt++;

                // 만약 그값이 우리가 원하는 답이라면 멈추고 저장
                if(temp[0] == idx) break;
            }

            sb.append(cnt).append("\n");

        }
        System.out.print(sb);
        br.close();
    }
}