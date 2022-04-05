import java.util.Scanner;

public class ArrAverage {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int arr[] = new int[5];
		int sum = 0;
		for(int i = 0; i < 5; i++) {
			arr[i] = scan.nextInt();
		}
		for(int i = 0; i < 5; i++) {
			if(arr[i] < 40) {
				arr[i] = 40;
			}
		}
		for(int i = 0; i < 5; i++) {
			sum += arr[i];
		}
		System.out.println(sum / 5);
	}

}
