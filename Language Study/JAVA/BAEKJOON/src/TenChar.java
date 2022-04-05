import java.io.*;

public class TenChar {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String text = br.readLine();
		
		//System.out.println(text.length());
		
		for(int i = 0; i < text.length(); i++) {
			//System.out.print(text.charAt(i));
			//bw.write(String.valueOf(text.charAt(i)));
			bw.write(text.charAt(i));
			
			if(i % 10 == 9) {	
				bw.newLine();
			}
		}
		bw.flush();
		bw.close();
	}

}
