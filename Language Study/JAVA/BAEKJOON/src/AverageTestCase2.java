import java.util.Scanner;
import java.text.DecimalFormat;

public class AverageTestCase2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String pattern = "#####.###";
		DecimalFormat dformat = new DecimalFormat(pattern);
		
		int Case;
		Case = scan.nextInt();
		int sum = 0;
		double avg[] = new double[Case];
		int count[] = new int[Case];
		for(int i = 0; i < Case; i++) {
			count[i] = 0;
		}
		
		int N[] = new int[Case];
		int arr[][];
		
		for(int i = 0; i < Case; i++) {
			N[i] = scan.nextInt();
			arr = new int[Case][];
			
			for(int j = 0; j < N[i]; j++) {
				arr[i] = new int[N[i]];
				arr[i][j] = scan.nextInt();
				sum += arr[i][j];
			}
			avg[i] = sum / N[i];
			sum = 0;
			for(int k = 0; k < N[i]; k++) {
				if(arr[i][k] > avg[i]) {
					count[i] += 1;
					System.out.println(count[i]);
				}
			}
		}
		
		/*for(int i = 0; i < Case; i++) {
			for(int j = 0; j < N[i]; j++) {
				if(arr[i][j] > avg[i]) {
					count[i] += 1;
				}
			}
		}*/
		for(int i = 0; i < Case; i++) {
			avg[i] = count[i] / N[i] * 100;
		}
		
		for(int i = 0; i < Case; i++) {
			System.out.println(avg[i]);
		}
		
		
		
		//System.out.println(arr[0][0]);
		
		/*for(int k = 0; k < Case; k++) {
			System.out.print(N[k] + " ");
			for(int a = 0; a < N[k]; a++) {
				
				System.out.print(arr[k][a] + " ");
			}
			System.out.println();
		}*/
		
	}

}
