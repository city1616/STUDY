package pre_1;

public class pre_3 {

	public static void main(String[] args) {
		
		for(int i = 0; i <= 4; i++) {
			for(int su = 1; su <= 9; su++) {
				for(int j = 1; j <= 2; j++) {
					int dan = 2 * i + j;
					if(dan != 10) {
						System.out.print(dan + " * " + su + " = " + dan * su + "\t");
					}
					
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
