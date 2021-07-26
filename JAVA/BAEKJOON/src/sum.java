import java.util.Scanner; //성공 

public class sum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		int result = 0;
		int arr[] = new int[x];
		
		String y = scan.next();
				
		for(int i = 0; i < x; i++) {
			arr[i] = y.charAt(i) - 48;
			//System.out.println(arr[i - 1] + "i = " + i);
			result += arr[i];
			//System.out.println(result);
		}
		System.out.println(result);
	}

}
