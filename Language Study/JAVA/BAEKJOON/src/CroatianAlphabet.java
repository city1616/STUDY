import java.util.Scanner;

public class CroatianAlphabet {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String croatia[] = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		String str = scan.nextLine();
		
		for(int i = 0; i < 8; i++) {
			str = str.replace(croatia[i],  "a");
		}
		
		System.out.println(str.length());
		
	}

}
