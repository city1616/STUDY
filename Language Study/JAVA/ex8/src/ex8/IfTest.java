package ex8;

public class IfTest {

	public static void main(String[] args) {
		
		if(args.length != 3) {
			System.out.println("인수의 개수가 올바르지 않습니다.");
			return;
		}
		char op = args[1].charAt(0);
		int op1 = Integer.parseInt(args[0]);
		int op2 = Integer.parseInt(args[2]);
		
		if(op == '+') {
			System.out.println("결과는 :" + (op1 + op2) + "입니다.");
		}
		else if(op == '-') {
			System.out.println("결과는 :" + (op1 - op2) + "입니다.");
		}
		else
			System.out.println("올바른 연산자가 아닙니다.");
	}

}
