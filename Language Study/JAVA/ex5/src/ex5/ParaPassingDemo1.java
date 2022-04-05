package ex5;

class ParaPassing1 {
	public void change(int i, int j1[]) {
		i = 20;
		j1[3] = 400;
	}
	
	public void display(int i, int j2[]) {
		System.out.println("객체 속성 변수 i의 값 : " + i);
		System.out.print("배열의 값 : ");
		for(int index = 0; index < j2.length; index++) {
			System.out.print(j2[index] + " ");
		}
		System.out.println(" ");
	}
}

public class ParaPassingDemo1 {

	public static void main(String[] args) {
		ParaPassing1 cb = new ParaPassing1();
	    int i = 10;
	    int j[]  = { 1, 2, 3, 4 };
	    System.out.println("첫번째 display() 메소드 호출");
	    cb.display(i, j);
	    cb.change(i, j);
	    System.out.println("======================");
	    System.out.println("값을 변환한 다음 두번째 display() 호출");
	    cb.display(i, j);
	  }

}
