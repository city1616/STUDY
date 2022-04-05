package ex5;

class Box1 {
	  int width;
	  int height;
	  int depth;
	  long idNum;
	  static long boxID = 0;
	  public Box1() {
	    idNum = boxID++;
	  }
	} 
	class StaticDemo {
	  public static void main(String args[]) {
	    Box1 mybox1 = new Box1();
	    Box1 mybox2 = new Box1();
	    Box1 mybox3 = new Box1();
	    Box1 mybox4 = new Box1();
	    System.out.println("mybox1의 id 번호 : " + mybox1.idNum);
	    System.out.println("mybox2의 id 번호 : " + mybox2.idNum);
	    System.out.println("mybox3의 id 번호 : " + mybox3.idNum);
	    System.out.println("mybox4의 id 번호 : " + mybox4.idNum);
	    System.out.println("전체 박스의 개수는 "+ Box1.boxID + "입니다.");
	  }}
