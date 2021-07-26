import java.util.Scanner;

public class starPrint {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N;
		N = scan.nextInt();
		String star = "*";

		for(int i = 1; i <= N; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.printf("%5s", star);
			}	
			//System.out.print(star);

			System.out.println();
		}
		
	}

}
