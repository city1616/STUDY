package ex4;

public class star {

	public static void main(String[] args) {
		int i, j;
		
		for(i = 1; i <= 8; i++) {
			for(j = 1; j <= 8; j++) {
				if(i>j){
					System.out.print(" * ");
				}
			}
			System.out.println();
		}
	} 
}
