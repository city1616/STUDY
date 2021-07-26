package ex4;

public class ArraySum {

	public static void main(String[] args) {
		
		int sum = 0;
		
		int p[][] = new int[4][5];
			
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 5; j++) {
				p[i][j] = 4 * i + j;				
				}
		}
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 5; j++) {
				
				sum += p[i][j];
			}
		}
		
		System.out.println("sum = " + sum);
			
	}

}
