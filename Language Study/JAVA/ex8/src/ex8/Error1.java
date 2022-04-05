package ex8;


public class Error1 {
   public static void main(String args[]) {
       try {
          if (args.length != 3)  
             throw new ParameterMissMatching("매개변수 개수 불일치");
          char op = args[1].charAt(0); 
          int op1 = Integer.parseInt(args[0]) ;
          int op2 = Integer.parseInt(args[2]);
          if (op == '+')
             System.out.println("결과는 : " + (op1 + op2) + "입니다");
          else if (op == '-')
             System.out.println("결과는 : " + (op1 - op2) + "입니다");
          else
             throw new OperatorMissMatching("연산자 불일치");
       }
       catch (ParameterMissMatching e) {
            System.out.println(e + " 발생");
       }
       catch (OperatorMissMatching e) {
            System.out.println(e + " 발생");
       }
   }
}
class ParameterMissMatching extends Exception {
     public ParameterMissMatching(String message) {
          super(message);
     }
   }

   class OperatorMissMatching extends Exception {
     public OperatorMissMatching(String message) {
          super(message);
     }
   }