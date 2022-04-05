import java.util.Scanner;

public class SugerDe {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int result = 0;
		int tmp = 0;
		
		
		
		if(n < 3) {
			result = -1;
		}
		int bigMax = n / 5;
		//System.out.println("bigMax = " + bigMax);
			
		for(int i = bigMax; i > -1; i--) {
			
			tmp = n - (i * 5);
			//System.out.println(i + "tmp = " + tmp);
			if(tmp % 3 == 0) {
				//System.out.println(bigMax + "  " + (tmp / 3));
				result = i + (tmp / 3);
				bigMax = i;
				//System.out.println(result);
				break;
				
			}
			else {
				result = -1;
			}
		}
		
		//System.out.println("bigMax = " + bigMax + " smallMax = " + (tmp/3));
		
		System.out.println(result);
		
	}

}
