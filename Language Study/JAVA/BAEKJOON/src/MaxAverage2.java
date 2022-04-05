import java.util.Scanner;          		//소수점 2자리까지 표시, 
import java.text.DecimalFormat;
import java.util.Arrays;

public class MaxAverage2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String pattern = "#####.00";
		DecimalFormat dformat = new DecimalFormat(pattern);
		
		int N = scan.nextInt();
		double arr[] = new double[N];
		double Max = 0;
		double sum = 0; 
		double Average = 0;
		
		for(int i = 0; i < N; i++) {
			arr[i] = scan.nextInt();
		}
		Arrays.sort(arr);
		Max = arr[arr.length - 1];
		System.out.println(Max);
		
		for(int i = 0; i < N; i++) {
			arr[i] = arr[i] / Max * 100;
			System.out.println(arr[i]);
		}
		
		for(int j = 0; j < N; j++) {
			sum += arr[j];
		}
		Average = sum / N;
		//System.out.println(Math.round(Average * 100) / 100.00);
		System.out.println(dformat.format(Average));
	}

}
