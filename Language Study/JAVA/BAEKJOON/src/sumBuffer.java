import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.*;
import java.io.*;

public class sumBuffer {

	public static void main(String[] args) throws IOException { //예외처리 필
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = br.read();
		int result = 0;
		int arr[] = new int[num];
		
		String x = br.readLine();
		
		for(int i = 1; i <= num; i++) {
			arr[i - 1] = x.charAt(i) - 48;
			System.out.println("arr[" + (i - 1) + "] = " + arr[i - 1] + " i = " + (i - 1));
			result += arr[i - 1];
			
		}
		System.out.println(result);
	}
	

}
