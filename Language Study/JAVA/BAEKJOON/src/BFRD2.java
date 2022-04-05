import java.io.BufferedReader;  //succes
import java.io.InputStreamReader;
import java.io.*;
import java.util.StringTokenizer;

public class BFRD2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int c = Integer.parseInt(br.readLine());
		int a = 0, b = 0;
		int res[] = new int[c];
		
			
		for(int i = 0; i < c; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			res[i] = a + b;
		}
		for(int i = 0; i < c; i++) {
			//System.out.println(res[i]);
			bw.write(String.valueOf(res[i]));
			bw.newLine();
		}
		
		
		bw.flush();
		bw.close();
			
		
	}

}
