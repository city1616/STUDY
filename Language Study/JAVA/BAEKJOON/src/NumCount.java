import java.util.Scanner;

public class NumCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int sum = A * B * C;
		int num[] = new int[10];
		for(int i = 0; i < num.length; i++) {
			num[i] = 0;
		}
		
		String temp = String.valueOf(sum);
		
		int arr[] = new int[temp.length()];
		
		for(int i = 0; i < temp.length(); i++) {
			arr[i] = 0;
		}
		for(int i = 0; i < temp.length(); i++) {
			arr[i] = temp.charAt(i) - 48;
			//System.out.println(arr[i]);
		}
		/*for(int i = 0; i < temp.length(); i++) {
			System.out.println(arr[i]);
		}*/
		for(int i = 0; i < arr.length; i++) {
			switch(arr[i]) {
			case 0 :
				num[0]++;
				break;
			case 1 :
				num[1]++;
				break;
			case 2 :
				num[2]++;
				break;
			case 3 :
				num[3]++;
				break;
			case 4 :
				num[4]++;
				break;
			case 5 :
				num[5]++;
				break;
			case 6 :
				num[6]++;
				break;
			case 7 :
				num[7]++;
				break;
			case 8 :
				num[8]++;
				break;
			case 9 :
				num[9]++;
				break;
			default :
				break;
			}
		}
		for(int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		
	}

}
