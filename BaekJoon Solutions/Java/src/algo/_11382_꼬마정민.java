import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _11382_꼬마정민 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        long res = 0;
        for(int i = 0; i < 3; i++) res += Long.parseLong(st.nextToken());
        System.out.println(res);
    }
}
