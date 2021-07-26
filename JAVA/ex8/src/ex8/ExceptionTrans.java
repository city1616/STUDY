package ex8;

public class ExceptionTrans {
	 static int a, b;
	  public static void main(String args[]) {
	    try {
	      a = Integer.parseInt(args[0]); 
	      b = Integer.parseInt(args[1]);
	      System.out.println("매개변수로 입력받은 두 개의 값 :");
	      System.out.println(" a = " + a + " b = " + b );
	      System.out.println("=========================");
	      System.out.println("a() 메소드 호출 전");
	      a();
	      System.out.println("a() 메소드 호출 후");
	    }
	    catch(ArithmeticException e) {
	      System.out.println("ArithmeticException 처리 루틴 : ");
	      System.out.println(e + " 예외 발생"); 
	    }
	    catch(ArrayIndexOutOfBoundsException e) {
	      System.out.println("ArrayIndexOutOfBoundsException 처리 루틴 : ");
	      System.out.println(e + " 예외 발생");    
	    }
	    catch(ClassCastException e) {
	      System.out.println("ClassCastException 처리 루틴 : ");
	      System.out.println(e + " 예외 발생");       
	    }   
	    catch(Exception e) {
	        System.out.println("나머지 모든 예외 처리 루틴 : ");
	        System.out.println(e + " 예외 발생");
	      } 
	      finally {
	        System.out.println("메소드 main()의 finally 블록 수행");
	      }
	    }
	   public static void a() throws ClassCastException, 
	               ArrayIndexOutOfBoundsException, ArithmeticException {
	        System.out.println("b() 메소드 호출 전");
	        b();
	        System.out.println("b() 메소드 호출 후");
	    }
	    public static void b() throws ArithmeticException, 
	               ArrayIndexOutOfBoundsException {
	         System.out.println("c() 메소드 호출 전");
	         c();
	         System.out.println("c() 메소드 호출 후");
	    }
	    public static void c() throws ArithmeticException {
	        System.out.println("최종 메소드 예외 발생 문장 수행 전");
	        System.out.println("a를 b로 나눈 몫 = " + (a/b) );         
	        System.out.println("최종 메소드 예외 발생 문장 수행 후"); 
	    }

}
