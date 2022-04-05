import java.util.Scanner;     //실패 

public class Suger {

	public static void main(String[] args) {
		
		int N, result;
		Scanner scan = new Scanner(System.in);
		System.out.println("N을 입력하세요.");
		
		N = scan.nextInt();
		
		if(N >= 3 && N <= 50000) {
			if(N % 5 == 0) {
				result = N / 5;
				System.out.println("총 봉지 개수 : " + result);
			}
			else if((N % 5) % 3 == 0) {
				result = N / 5 + (N % 5) / 3;
				System.out.println("총 봉지 개수 : " + result);
			}
			else if((N % 3) % 5 == 0) {
				result = N / 3 + (N % 3) / 5;
				System.out.println("총 봉지 개수 : " + result);
			}
			else if(N % 3 == 0) {
				result = N / 3;
				System.out.println("총 봉지 개수 : " + result);
			}
			else {
				System.out.println("N을 정확하게 나눌 수 없습니다.(-1)");
			}
		}
		
		else {
			System.out.println("N의 범위가 아닙니다. (3 <= N <= 50000)");
		}
		
	}

}
