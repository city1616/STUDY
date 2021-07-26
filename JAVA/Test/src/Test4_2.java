
public class Test4_2 {

	public static void main(String[] args) {
		
		int i = 0;
		int answer = 1 + 5 + 7 + 11 + 13 + 17 + 19;
		int sum = 0;
		
		for(i = 0; i <= 20; i++) {
			if(i % 2 != 0 && i % 3 != 0) {
				sum += i;
			}	
			
		}
		
		System.out.println("answer = " + answer);
		System.out.println("Sum = " + sum);
		
	}

}
