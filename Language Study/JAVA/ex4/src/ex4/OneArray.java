package ex4;

public class OneArray {

	public static void main(String[] args) {
		int a[] = new int[4];
		int i, sum = 0;
		
		for(i = 0; i < 4; i++) {
			a[i] = Integer.parseInt(args[i]);
		}
		for(i = 0; i < 4; i++) {
			sum += a[i];
		}
		System.out.print("sum = " + sum);	
	}

}
