package ex4;


public class Threescn {

	public static void main(String[] args) {
		if(args.length != 3) {
			System.out.println("인수의 개수가 올바르지 않습니다.");
			return;
		}
		
		int k;
		char op = args[1].charAt(0);
		int op1 = Integer.parseInt(args[0]);
		int op2 = Integer.parseInt(args[2]);
		
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
