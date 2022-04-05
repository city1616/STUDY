package ex8;

public class ExceptionError1 {

	public static void main(String[] args) {
		try {
	         System.out.println("매개변수로 받은 두 개의 값");
	         int a = Integer.parseInt(args[0]); 
	         int b = Integer.parseInt(args[1]);
	         System.out.println(" a = " + a + " b = " + b );
	         System.out.println(" a를 b로 나눈 몫 = " + (a/b) );
	         System.out.println("나눗셈이 원할히 수행되었습니다.");
	      }
	      catch(ArithmeticException e) {
	         System.out.println("=============================");
	         System.out.println("ArithmeticException 처리 루틴 : ");
	         System.out.println(e + " 예외 발생");
	    }
	      catch(ArrayIndexOutOfBoundsException e) {
	         System.out.println("=============================");
	         System.out.println("ArrayIndexOutOfBoundsException 처리 루틴");
	         System.out.println(e + " 예외 발생"); 
	    } 
	     catch(NumberFormatException e) { //문자열의 숫자가 유효한 형태인가
	         System.out.println("=============================");
	         System.out.println("NumberFormatException 처리 루틴");
	         System.out.println(e + " 예외 발생");
	    }
		   finally {
			      System.out.println("======================");
			      System.out.println("예외 처리를 끝내고 finally 블럭을 수행합니다");
		   }
	}

}
