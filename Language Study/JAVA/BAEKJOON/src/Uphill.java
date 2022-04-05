import java.util.Scanner; //보류 

public class Uphill {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] arr;
		int i, first, last;
		i = scan.nextInt();
		arr = new int[i];
		
		for(int j = 0; j < arr.length; j++) {
			arr[j] = scan.nextInt();
		}
		
		 if(arr[0] < arr[1]) {
			 first = arr[0];
			 last = arr[1];
		 }
		 else {
			 for(int j = 0; j < arr.length; j++) {
				 if(arr[j] < arr[j +1 ] ) {
					 first = arr[j];
					 last = arr[j + 1];
					 break;
				 }
			 }
		 }
		 
		 
	}

}
