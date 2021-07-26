import java.io.*;  //sum이랑 같은 문제 

public class sumeach {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int arr[] = new int[N];
		String Num = br.readLine();
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Num.charAt(i) - 48;
			//System.out.println(Num.charAt(i));
			//bw.write(String.valueOf(arr[i]));
			sum += arr[i];
		}
		//bw.write(String.valueOf(sum));
		//System.out.println();
		System.out.println(sum);
		
	}

}
