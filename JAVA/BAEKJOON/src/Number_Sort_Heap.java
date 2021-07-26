import java.io.FileInputStream;
import java.util.Scanner;

public class Number_Sort_Heap {
	
	public static void main(String[] args) throws Exceptioin {
		
		Scanner scan = new Scanner(new FileInputStream("input.txt"));
		
		Integer a = null;
		int N = scan.nextInt();
		int size = 2000000;
		int[] arr = new int[size + 5];
		for(int i = 1; i <= N; i++) {
			arr[scan.nextInt() + 1000000] = 1;
		}
		for(int i = 0; i <= size; i++) {
			if(N==0) break;
			
			if(arr[i] != 0) {
				System.out.println(i - 1000000);
				N--;
			}
		}
	}
}
