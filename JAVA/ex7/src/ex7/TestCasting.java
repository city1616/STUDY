package ex7;

class Acast {
	int a = 1;
}

class Bcast extends Acast {
	int b = 2;
}

class Ccast extends Bcast {
	int c = 3;
}

public class TestCasting {

	public static void main(String[] args) {
	
		
		Acast refA = new Ccast();
		System.out.println("refA.a의 값은 " + refA.a);
	}

}
