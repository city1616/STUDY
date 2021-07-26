package ex5;

class calcs {
	double add(int a, int b) {
		int sum = 0;
		sum = a + b;
		return sum;
	}
	double sub(int a, int b) {
		int sum = 0;
		sum = a - b;
		return sum;
	}
	double mul(int a, int b) {
		int sum = 0;
		sum = a * b;
		return sum;
	}
	double div(int a, int b) {
		int sum = 0;
		sum = a / b;
		return sum;
	}
	
}

public class AddSubMulDiv {

	public static void main(String[] args) {
		System.out.println("사칙 연산을 입력하시오.");
		int op1 = Integer.parseInt(args[0]);
		char op = args[1].charAt(0);
		int op2 = Integer.parseInt(args[2]);
		calcs obj = new calcs();
		double sum = 0;
		
		if(args.length != 3) {
			System.out.println("매개변수 숫자가 바르지않음");
		}
		
		else {
		
		switch(op) {
		case '+' :
			sum = obj.add(op1, op2);
			System.out.println(op1 +" " + op + " " + op2 + " = " + sum);
			break;
		case '-' :
			sum = obj.sub(op1, op2);
			System.out.println(op1 +" " + op + " " + op2 + " = " + sum);
			break;
		case '*' :
			sum = obj.mul(op1, op2);
			System.out.println(op1 +" " + op + " " + op2 + " = " + sum);
			break;
		case '/' :
			sum = obj.div(op1, op2);
			System.out.println(op1 +" " + op + " " + op2 + " = " + sum);
			break;
		default :
				System.out.println("연산자를 잘못 입력하였습니다.");
				}
		
			}
	}

}
