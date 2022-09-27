package algo;

import java.util.Scanner;

public class _2588_곱셈 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		String num2 = sc.next();
		int total = 0;
		for(int i = 2; i >= 0; i--) {
			System.out.println(num1 * (num2.charAt(i) - '0'));			
			total += num1 * (num2.charAt(i) - '0') * (int)Math.pow(10, 2 - i);
		}
		System.out.println(total);
		sc.close();
	}
}
