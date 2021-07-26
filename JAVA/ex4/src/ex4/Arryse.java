package ex4;

public class Arryse {

	public static void main(String[] args) {
		int k[][] = new int[4][5];
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 5; j++) {
				k[i][j] = 4 * i + j;
			}
		}
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print(k[i][j] + " ");
				
			}
			System.out.println(" ");
		}
		
	}

}
