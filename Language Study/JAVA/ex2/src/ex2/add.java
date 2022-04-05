package ex2;

public class add {

	public static void main(String[] args) {
		
		int i, odd = 0, even = 0;
		for( i = 0; i <= 100; i++) {
			if(i % 2 == 1) {
				odd += i;
			}
			
			else
				even += i;
		}
		
		System.out.println("odd = " + odd + "  even = " + even);
		

	}

}
