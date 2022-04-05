package ex4; 

import java.util.Scanner;

public class Grading2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i, j, k = 0;
		int answer[][] = {
				{1, 3, 2, 4, 3, 1, 4, 2, 2, 1 },
				{3, 2, 4, 2, 2, 1, 1, 3, 4, 1 },
				{2, 4, 3, 2, 1, 2, 1, 3, 3, 4 },
				{2, 3, 3, 1, 1, 3, 2, 2, 4, 4 },
				{3, 1, 1, 2, 4, 1, 2, 3, 1, 3 }};
		int a[] = new int[10];
		for(i=0;i<10;i++){
			a[i] = scan.nextInt();
		}
		for(i=0;i<5;i++){
			for(j=0;j<10;j++){
				if(answer[i][j] ==a[j])
					k++;
			}
			System.out.println(i + "의 점수 : " +k+"점");
			k=0;
		}
		
	}

}
