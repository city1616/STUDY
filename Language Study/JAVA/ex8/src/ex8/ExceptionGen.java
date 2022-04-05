package ex8;

class ExceptionGen {
	  public static void main(String args[]) {
	    try {
	      a();
	    } catch(ArrayIndexOutOfBoundsException e) {
	      System.out.println("=============================");
	      System.out.println("ArrayIndexOutOfBoundsException 처리 루틴");
	      System.out.println(e + " 발생");
	    }
	  }
	  static void a() {
	    try {
	      throw new NullPointerException("널 포인터 예외"); 
	    } catch(NullPointerException e) {
	       System.out.println("=============================");
	       System.out.println("NullPointerException 처리 루틴");
	       System.out.println(e + " 발생");
	       throw new ArrayIndexOutOfBoundsException("배열 첨자 예외");
	     }
	  }
	}
