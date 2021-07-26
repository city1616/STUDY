import java.util.Scanner;

public class StringRepeat {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int C = scan.nextInt();
		int T[] = new int[C];
		String S[] = new String[C];
		
		for(int i = 0; i < C; i++) {
			T[i] = scan.nextInt();      //	반복 횟수  
			S[i] = scan.next();
		}
		for(int i = 0; i < C; i++) {
			for(int j = 0; j < S[i].length(); j++) {
				for(int k = 0; k < T[i]; k++) {
					System.out.print(S[i].charAt(j));
				}
			}
			System.out.println();
		}
	}

}
