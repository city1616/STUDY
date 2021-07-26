import java.util.Scanner;        //상수   

public class BJ2908 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		char c1[] = new char[3];
		char c2[] = new char[3];
		char temp1, temp2;
		String str1, str2;
		String r1 = "";
		String r2 = "";
		
		str1 = String.valueOf(n1);
		for(int i = 0; i < 3; i++) {
			c1[i] = str1.charAt(i);
			//System.out.println(c1[i]);
		}
		temp1 = c1[0];
		c1[0] = c1[2];
		c1[2] = temp1;
		for(int i = 0; i < 3; i++) {
			r1 += c1[i];
		}
		
		str2 = String.valueOf(n2);
		for(int i = 0; i < 3; i++) {
			c2[i] = str2.charAt(i);
			//System.out.println(c2[i]);
		}
		temp2 = c2[0];
		c2[0] = c2[2];
		c2[2] = temp2;
		for(int i = 0; i < 3; i++) {
			r2 += c2[i];
		}
		//System.out.println(r1);
		//System.out.println(r2);
		n1 = Integer.parseInt(r1);
		n2 = Integer.parseInt(r2);
		if(n1 > n2) {
			System.out.println(n1);
		}
		else if(n2 > n1) {
			System.out.println(n2);
		}
		else {
			System.out.println(n1 + " = " + n2);
		}
		
		
	}

}
