import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ThreeNum2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		
		int arr[] = new int[3];
		int Max = 0;
		for(int i = 0; i < 3; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		for(int i = 0; i < 3; i++) {
			System.out.println("arr[" + i + "] = " + arr[i]);
		}
		
		Arrays.sort(arr);
		
		Max = arr[arr.length - 2];
		
		
		System.out.println(Max);
		
	}

}
