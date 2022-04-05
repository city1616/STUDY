package ex3;

class C {
	private int result1;
	public int add(int x, int y) {
		result1 = x + y;
		return result1;
	}
}

class D {
	private int result2;
	public int sub(int x, int y) {
		result2 = x - y;
		return result2;
	}
}

public class testa {

	public static void main(String[] args) {
		
		int temp;
		
		C objecta = new C();
		D objectb = new D();
		
		temp = objecta.add(10,  5);
		System.out.println("덧셈결과 = " + temp);
		
		temp = objectb.sub(10, 5);
		System.out.println("뺄셈결과 = " + temp);
	}

}
