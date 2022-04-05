package ex4;

import java.util.Scanner;

public class Threescn2 {

	public static void main(String[] args) {
		
		int k;
		int op1, op2;
		char op;
	
		if(args.length != 3) {
			System.out.println("인수의 개수가 올바르지 않습니다.");
			return;
		}		
		
		Scanner thr = new Scanner(System.in);
		op1 = thr.nextInt();
		op = thr.next().charAt(0);
		op2 = thr.nextInt();
		
		if(args.length == 3) {
			if(op == '+') {
				k = op1 + op2;
				System.out.println(op1 + " " + op + " " + op2 + " = " + k);
			}
			
			else if(op =='-') {
				k = op1 - op2;
				System.out.println(op1 + " " + op + " " + op2 + " = " + k);
			}
			else {
				System.out.println(op1 + " " + op + " " + op2 );
				System.out.println("연산자가 잘못 입력되었습니다.");
			}
		}		
		
	}

}
