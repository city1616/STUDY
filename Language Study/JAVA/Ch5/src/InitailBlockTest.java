class Good {
	{
		System.out.println("good의 인스턴스 초기화 블록 실행 ");
	}
	static { //static초기화 블록을 정의함. 클래스가 로딩될 때 한 번만 실행된다. 
		System.out.println("good의 static 초기화 블록 실행 ");
	}
	
}
public class InitailBlockTest {
	
	//Initial block test

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Good g1 = new Good();
		Good g2 = new Good();
		Good g3 = new Good();
		System.out.println("main");

	}

}
