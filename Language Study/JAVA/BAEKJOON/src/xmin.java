import java.util.Scanner;   //성공 

public class xmin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x, n;
		n = sc.nextInt();
		x = sc.nextInt();
		
		int arr[] = new int[n];
		
		for(int j = 0; j < arr.length; j++) {
			arr[j] = sc.nextInt();
		}
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < x) {
				System.out.print(arr[i] + "    ");
			}
		}
	}

}
