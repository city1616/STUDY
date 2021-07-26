import java.util.Scanner;

public class starPrint2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		for(int i = 1; i <= N; i++) {
			
			for(int k = N - i; k >= 1; k--) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
