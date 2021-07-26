import java.util.Scanner;

public class sumeach2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int sum = 0;
		int arr[] = new int[N];
		
		String Num = scan.next();
		
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Num.charAt(i) - 48;
			sum += arr[i];
		}
		System.out.println(sum);
		
	}

}
