import java.io.*;

public class BFRD {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		int a = 0, b = 0;
		int c[] = new int[T];
		for(int i = 0; i < T; i++) {
			a = br.read();
			b = br.read();
			c[i] = a + b;
		}
		for(int i = 0; i < T; i++) {
			System.out.println(c[i]);
			//bw.write(c[i]);
		}
	}

}
