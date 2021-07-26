
public class Test4_8 {

	public static void main(String[] args) {
		
		int i, j;
		
		for(i = 0; i <= 10; i++) {
			for(j = 0; j <= 10; j ++) {
				if(2 * i + 4 * j == 10) {
					System.out.println("x = " + i + "   y = " + j);
				}
			}
		}
	}

}
