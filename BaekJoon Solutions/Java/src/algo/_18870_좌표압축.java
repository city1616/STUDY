import java.io.*;
import java.util.*;

public class _18870_좌표압축 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][3];
        List<Integer> list = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++) {
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = i;
        }

        Arrays.sort(arr, ((o1, o2) -> {
            return o1[0] - o2[0];
        }));
//        for(int[] a : arr) System.out.println(Arrays.toString(a));

        arr[0][2] = 0;
        list.add(arr[0][0]);
        for(int i = 1; i < N; i++) {
            if(list.get(list.size() - 1) != arr[i][0]) list.add(arr[i][0]);

            arr[i][2] = list.size() - 1;
        }

        Arrays.sort(arr, (o1, o2) -> {
            return o1[1] - o2[1];
        });

        for(int i = 0; i < N; i++) sb.append(arr[i][2]).append(" ");

        System.out.println(sb);
        br.close();
    }
}
