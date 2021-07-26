
public class VariableKind {
	
	//인스턴스 멤버 변수
	int memVar = 5;
	
	//static 멤버 변수
	static int staticVar = 10;

	public static void main(String[] args) {
		//로컬 변수
		int localVar;
		
		VariableKind vk1 = new VariableKind();
		System.out.println("vk1.memVar = " + vk1.memVar);
		System.out.println("vk1.staticVar = " + vk1.staticVar);
		System.out.println("VariableKind.staticVar = " + VariableKind.staticVar);
		System.out.println("staticVar = " + staticVar);
		VariableKind vk2 = new VariableKind();
		vk1.staticVar = 20;
		System.out.println("vk1.staticVar = " + vk1.staticVar);
		System.out.println("vk2.staticVar = " + vk2.staticVar);
		//System.out.println("localVar = " + localVar);   로컬변수는 변수 선언 시 값을 초기화하지 않으면 컴파일러가 값을 자동으로 초기화해 주는 것이 아니라 컴파일 오류가 발생 
	}

}
