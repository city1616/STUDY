package ex3;

class A {
	private int result1;
	public int add(int x, int y) {
		result1 = x + y;
		return result1;
	}
	
	public int sub(int x, int y) {
		result1 = x - y;
		return result1;
	}
}

class B extends A {
	private int result2;
	public int multi(int x, int y) {
		result2 = x * y;
		return result2;
	}
	
	public int divide(int x, int y) {
		result2 = x / y;
		return result2;
	}
}

class TestAB {

	public static void main(String[] args) {
		int temp;
		A objecta = new A();
		B objectb = new B();
		
		temp = objectb.add(10,  20);
		System.out.println("A의 add 수행결과 : " + temp);
		
		temp = objectb.add(1, 2);
		System.out.println("B의 add 수행결과 : " + temp);
		
		temp = objectb.multi(2,  2);
		System.out.println("B의 multi 수행결과 : " + temp);
		
		temp = objectb.multi(20,20);
		System.out.println("A의 multi 수행결과 : " + temp);
		
	}

}
