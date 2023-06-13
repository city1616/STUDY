package algo;

import java.io.*;
import java.util.*;

public class _2470_두용액 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());    // 용액 개수
        int[] water = new int[N];                   // 용액 값
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++) water[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(water); // 용액의 값이 들어있는 배열을 오름차순 정렬한다.

        int start = 0;      // 왼쪽 인덱스 번호
        int end = N - 1;    // 오른쪽 인덱스 번호

        int minStart = 0;   // 용액의 차이가 최소일 때의 왼쪽 인덱스 번호
        int minEnd = 0;     // 용액의 차이가 최소일 때의 오른쪽 인덱스 번호
        int minDiff = Integer.MAX_VALUE; // 차이의 최솟값

        while(start < end) {
            if(Math.abs(water[start] + water[end]) < minDiff) {  // 용액의 차이가 최소가 된다면
               minStart = start;        // 인덱스 번호 갱신
               minEnd = end;            // 인덱스 번호 갱신
               minDiff = Math.abs(water[start] + water[end]); // 최솟값 갱신
            }

            if(water[start] + water[end] > 0) end -= 1;     // 용액의 합이 0보다 크면 가리키는 값을 낮추기 위해 오른쪽 인덱스를 하나 낮춘다.
            else start += 1;                                // 용액의 합이 0보다 작으면 가리키는 값을 높이기 위해 왼쪽 인덱스를 하나 올린다.
        }

        System.out.println(water[minStart] + " " + water[minEnd]);
        br.close();
    }
}
