package ex7;

class A5 {
	void callme()  {
		System.out.println("클래스 A5의 callme() 메소드 실행");
	}
}
class B5 extends A5 {
	void callme()  {
		System.out.println("클래스 B5의 callme() 메소드 실행");
	}
}
class C extends A5 {
	void callme()  {
		System.out.println("클래스 C의 callme() 메소드 실행");
	}
}
public class OverridingCast {

	public static void main(String[] args) {
		A5 r = new A5();
		r.callme();
		r = new B5();
		r.callme();
		r = new C();
		r.callme();
	}

}
