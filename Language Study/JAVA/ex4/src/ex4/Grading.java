package ex4;

import java.util.Scanner;

public class Grading {

	public static void main(String[] args) {
		
		int i, j;
		Scanner scan = new Scanner(System.in);
		
		int answer[][] = {
				{1, 3, 2, 4, 3, 1, 4, 2, 2, 1 },
				{3, 2, 4, 2, 2, 1, 1, 3, 4, 1 },
				{2, 4, 3, 2, 1, 2, 1, 3, 3, 4 },
				{2, 3, 3, 1, 1, 3, 2, 2, 4, 4 },
				{3, 1, 1, 2, 4, 1, 2, 3, 1, 3 }
		};
		
		int a[] = new int[10];
		int k[] = new int [5];
		
		
		System.out.println("답을 입력하시오");
		
		for(i = 0; i < 10; i++) {
			a[i] = scan.nextInt();
		}
		
		for(i = 0; i < 5; i++) {
			for(j = 0; j < 10; j++) {
				if(answer[i][j] == a[j]) {
					k[i] += 1;
				}
			}
		}
		
		System.out.println("0의 점수 : " + k[0]);
		System.out.println("1의 점수 : " + k[1]);
		System.out.println("2의 점수 : " + k[2]);
		System.out.println("3의 점수 : " + k[3]);
		System.out.println("4의 점수 : " + k[4]);
		
		
	}

}
