
public class multip2 {

	public static void main(String[] args) {
		int i, j, dan, su;
		
		for(i = 0; i <= 1; i++) {
			for(su = 1; su <= 3; su++) {
				for(j = 2; j <= 4; j++) {
					dan = 3 * i + j;
					System.out.print(dan + " * " + su + " = " + dan * su + "    ");
				}
				System.out.println();
			}
			System.out.println();
		}
	
		for(su = 1; su <= 3; su++) {
			for (j = 2; j <= 3; j++) {
				i = 2;
				dan = 3 * i + j;
				System.out.print(dan + " * " + su + " = " + dan * su + "    ");
			}
			System.out.println();
		}
		System.out.println();
		
	}

}
