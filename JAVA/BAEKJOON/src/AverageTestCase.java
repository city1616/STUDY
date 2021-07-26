import java.util.Scanner;
import java.text.DecimalFormat;

public class AverageTestCase {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String pattern = "#####.000";
		DecimalFormat dformat = new DecimalFormat(pattern);
		
		int c = scan.nextInt();
		int sum = 0;
		int count = 0;
		double avg1 = 0;
		double avg[] = new double[1000];
		
		
		for(int i = 0; i < c; i++) {
			int n = scan.nextInt();
			int arr[] = new int[1000];
			
			
			for(int j = 0; j < n; j++) {
				arr[j] = scan.nextInt();
			}
			for(int k = 0; k < n; k++) {
				sum += arr[k];
			}
			avg1 = sum / n;
			for(int a = 0; a < n; a++) {
				if(arr[a] > avg1) {
					count += 1;
				}
			}
			avg[i] = (double)count / (double)n * 100;
			sum = 0;
			count = 0;
			
		}
		for(int i = 0; i < c; i++) {
			System.out.println(dformat.format(avg[i]) + "%");
		}
	}
}