import java.util.Scanner;

public class HanNum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int X = scan.nextInt();
		scan.close();
		
		if(X < 100) {
			System.out.println(X);
		}
		else {
			int result = 99;
			for(int i = 100; i <= X; ++i) {
				result += checkHanNumber(i);
			}
			if(X == 1000) {
				result--;     //checkHanNumber에서 1000도 등차수열이라고 나오기 때문에 1을 빼줘야됨 
			}
			System.out.println(result);
		}
		
	}
	
	private static int checkHanNumber(int number) {   
		int num1 = number / 100 % 10;
		int num2 = number / 10 % 10;
		int num3 = number % 10;
		
		if(num2 * 2 == num1 + num3) {
			return 1;
		}
		return 0;
	}

}
