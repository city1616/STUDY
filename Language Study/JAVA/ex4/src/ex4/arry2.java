package ex4;

public class arry2 {

	public static void main(String[] args) {
		int a[] = new int[4];
		int sum = 0, k = 0;
		
		for(int i = 0; i < 4; i++) {
			a[i] = k;
			k++;
		}
		for(int i = 0; i < 4; i++) {
			sum += a[i];
		}
		
		System.out.println("sum = " + sum);
		
	}

}
