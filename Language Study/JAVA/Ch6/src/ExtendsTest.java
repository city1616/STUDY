class Parent {
	int parentVar = 10;
	void parentMethod() {
		System.out.println("parent Method");
	}
}

class Child extends Parent {
	int childVar = 20;
	void ChildMethod() {
		System.out.println("child Method");
	}
}

public class ExtendsTest {
	
	//상속 테스트 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child child = new Child();
		
		System.out.println("child.parentVar = " + child.parentVar);
		System.out.println("child.childVar = " + child.childVar);
		
		child.parentMethod();
		child.ChildMethod();
	}

}
