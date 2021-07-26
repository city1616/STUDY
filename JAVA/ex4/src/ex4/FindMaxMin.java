package ex4;

public class FindMaxMin {

	public static void main(String[] args) {
		
		int i, max, min;
		int arr[] = new int[10];
		
		for(i = 0; i < 10; i++) {
			arr[i] = Integer.parseInt(args[i]);
		}
		
		max = min = arr[0];

		for(i = 1; i < 10; i++) {
			
			if(arr[i] < min) {
				min = arr[i];
			}
			
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		System.out.println("max = " + max + "  min = " + min);
		
	}

}
