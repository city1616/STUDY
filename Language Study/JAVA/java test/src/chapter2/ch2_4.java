package chapter2;

import java.util.Scanner;

public class ch2_4 {

	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		Scanner b = new Scanner(System.in);
		Scanner c = new Scanner(System.in);
		
		System.out.println("나이를 입력하세요");
		System.out.println("당신의 나이는 " + a.nextInt() + "살입니다.");
		System.out.println("체중을 입력하세요");
		System.out.println("당신의 체중은 " + b.nextDouble() + "kg입니다.");
		System.out.println("신장을 입력하세요");
		System.out.println("당신의 신장은 " + c.nextDouble() + "cm입니다.");
		
	}

}
