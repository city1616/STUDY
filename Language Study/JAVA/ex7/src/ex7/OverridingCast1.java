package ex7;

class AB {
	int k = 0;
	void callme()  {
		System.out.println("클래스 AB의 callme() 메소드 실행");
	}
}

class BC extends AB {
	int g = 10;
	void callme()  {
		System.out.println("클래스 BC의 callme() 메소드 실행");
	}
}
public class OverridingCast1 {

	public static void main(String[] args) {
		AB r1 = new AB();
		r1.callme();
		r1 = new BC();
		r1.callme();
		System.out.println("r1.k의 값은 " + r1.k);
		//System.out.println("r1.g의 값은 " + r1.g); 에러 
	}

}
