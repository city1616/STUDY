//import java.io.*;
//import java.util.StringTokenizer;
import java.util.Scanner;

public class wordNum {

	public static void main(String[] args) {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//StringTokenizer st = new StringTokenizer(br.readLine());
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine().trim();   //trim() -> 앞뒤 공백 제거 
		String word[] = str.split(" ");
		/*for(int i = 0; i < word.length; i++) {
			System.out.println(word[i]);
		}*/
		if(str.isEmpty()) {
			System.out.println("0");
		}
		else {
			System.out.println(word.length);
		}
		
	}

}
