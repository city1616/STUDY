package algo;

import java.util.Scanner;

public class _1330_두_수_비교하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		String result = null;

		if(A > B) {
			result = ">";
		} else if(A < B) {
			result = "<";
		} else {
			result = "==";
		}

		System.out.println(result);
		sc.close();
	}
}
