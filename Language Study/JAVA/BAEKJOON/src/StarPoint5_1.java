import java.util.Scanner;      // 프랙탈 구조    

public class StarPoint5_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int h = 3, m = 1, j;
		
		String Star[] = new String[n];
		Star[0] = "  *  ";
		Star[1] = " * * ";
		Star[2] = "*****";
		
		String space = "   ";
		
		for(;h < n; h <<= 1, m <<= 1) {
			for(j = 0; j < h; j++) {
				Star[h + j] = Star[j] + " " + Star[j];
				Star[j] = space + Star[j] + space;
			}
			for(j = 0; j < m; j++) {
				space += "   ";
			}
			//System.out.println(h + ", " + m);
		}
		
		for(int i = 0; i < Star.length; i++) {
			System.out.println(Star[i]);
		}
		
	}

}
