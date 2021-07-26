package ex4;

import java.util.Scanner;

public class Dan3 {

	public static void main(String[] args) {
		int i, j;
		Scanner scan = new Scanner(System.in);
		
		i = scan.nextInt();
		j = 1;
		
		System.out.println("* 구구단 3단 *");
		
		while(j <= 9 ) {
			System.out.println(i + "*" + j + " = " + i * j);
			j ++;
		}
	}

}
