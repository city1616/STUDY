package ex8;

import java.util.Scanner;
public class ExceptionError222 {

	public static void main(String[] args) {
		try {
		int a = 0;
		int b = 2;
		System.out.println("2/0 은 : ");
		int div = b /a ;           // ArithmeticException 예외 발생
		System.out.println(div);
		int[] c = new int[-10];     //NegativeArraySizeException 
		
		int[] d = new int[10];
		System.out.println(c[11]);     //ArrayIndexOutOfBoundsException
		}  
		catch(ArithmeticException e) {
			System.out.println("=============================");
			System.out.println("ArithmeticException 예외 발생 ");
			System.out.println(e + "예외 발생");
		}
		catch(NegativeArraySizeException a) {
			System.out.println("=============================");
			System.out.println(a + "예외 발생");
		}
		catch(ArrayIndexOutOfBoundsException r) {
			System.out.println("=============================");
			System.out.println(r + "예외 발생");
		}
		finally {
			System.out.println("=============================");
			System.out.println("예외 처리를 끝내고 finally 블록을 수행합니다.");
		}
		
		
		
	}

}
