import java.io.*;

public class _25314_코딩은체육과목입니다 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int cnt = N / 4;
        for(int i = 0; i < cnt; i++) {
            sb.append("long ");
        }
        sb.append("int");
        System.out.println(sb);
        br.close();
    }
}
