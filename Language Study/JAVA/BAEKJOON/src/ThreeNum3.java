import java.util.Scanner;          //세 수 중에서 두번째로 큰 수 구하기 , 배열 이용하기 , 정렬 이용  
import java.util.Arrays;

public class ThreeNum3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int arr[] = new int[3];
		int Max = 0;
		for(int i = 0; i < 3; i++) {
			arr[i] = scan.nextInt();
		}
		
		Arrays.sort(arr);
		
		Max = arr[1];
		
		
		System.out.println(Max);
	}

}
