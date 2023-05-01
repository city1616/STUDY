package algo;

import java.io.*;
import java.util.*;

public class _1427_소트인사이드 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String S = br.readLine();
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < S.length(); i++) {
            list.add(S.charAt(i) - '0');
        }
        Collections.sort(list, Collections.reverseOrder());
        for(int i = 0; i < list.size(); i++) sb.append(list.get(i));
        System.out.println(sb);
        br.close();
    }
}
