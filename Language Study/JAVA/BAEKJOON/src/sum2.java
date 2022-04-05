import java.util.Scanner; //성공 (런타임오류) 

public class sum2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int x;
		int y;
		int m;

		int result = 0;
		
		x = scan.nextInt();
		y = scan.nextInt();
				
		for(int i = x; i > 0 ; i--) {
			m = (int) (y / Math.pow(10,  i - 1)); 
			//System.out.println(m);
			y -= m * Math.pow(10, i - 1);
			//System.out.println(y);
			result += m;
		}
		
		
		System.out.println(result);
	}

}
