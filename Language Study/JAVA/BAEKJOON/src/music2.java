import java.util.Scanner;

public class music2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] arr;
		arr = new int[8];
		String a;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		if(arr[0] == 1 && arr[1] == 2 && arr[2] == 3 && arr[3] == 4 && arr[4] == 5 && arr[5] == 6 && arr[6] == 7 && arr[7] == 8) {
			a = "ascending";
			System.out.println(a);
		}
		else if(arr[0] == 8 && arr[1] == 7 && arr[2] == 6 && arr[3] == 5 && arr[4] == 4 && arr[5] == 3 && arr[6] == 2 && arr[7] == 1) {
			a = "descending";
			System.out.println(a);
		}
		else {
			a = "mixed";
			System.out.println(a);
		}
		
		
	}

}
