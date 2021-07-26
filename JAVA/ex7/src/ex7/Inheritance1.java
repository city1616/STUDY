package ex7;

class A {
	int i;
	/*private*/ int j;
	void setij(int x, int y) {
		i = x;
		j = y;
	}
}

class B extends A {
	int total;
	void sum() {
		total = i + j; //에러발생. private 타입의 변수 j
	}
}

public class Inheritance1 {

	public static void main(String[] args) {
		B subOb = new B();
		subOb.sum();
	}

}
