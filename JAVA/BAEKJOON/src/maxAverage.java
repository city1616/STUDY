import java.util.Scanner;  			//실패 
import java.text.DecimalFormat;

public class maxAverage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat form = new DecimalFormat("#.00");
		
		int N = sc.nextInt();
		double MaxScore = 0;
		int sum = 0;
		
		double Average;
		
		double score[] = new double[N];
		
		for(int i = 0; i < N; i++) {
			score[i] = sc.nextInt();
		}
		
		for(int j = 0; j < N; j++) {
			
			if(score[j] >= MaxScore) {
				MaxScore = score[j];
				}
			}
				
		for(int m = 0; m < N; m++) {
			
				score[m] = score[m] / MaxScore * 100;
				sum += score[m];
		}
			
		Average = sum / N;
		System.out.println(form.format(Average));
	}

}
