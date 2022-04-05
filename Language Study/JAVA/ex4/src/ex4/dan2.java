package ex4;

import java.util.Scanner;

public class dan2 {

	public static void main(String[] args) {
		int i, j;
		j = 1;
		Scanner a = new Scanner(System.in);
		i = a.nextInt();
		
		System.out.println(" 구구단");
		
		do {
			System.out.println(" " + i + " * " + j + " = " + i * j);
			j++;
		}while(j <= 9);
	}

}
