
public class Test4_3 {

	public static void main(String[] args) {
		
		int i;
		int sum = 0;
		int totalsum = 0;
		
		for(i = 1; i <= 10; i++) {
			sum += i;
			totalsum += sum;
		}
		
		System.out.println("total sum = " + totalsum);
		
	}

}
