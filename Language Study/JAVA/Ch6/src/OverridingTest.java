class OverridingParent {
	void parentMethod() {
		System.out.println("parent method");
	}
}

class OverridingChild extends OverridingParent {
	void parentMethod() {
		System.out.println("overridng method");
	}
}

public class OverridingTest {
	
	//Overriding Test

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OverridingChild oc = new OverridingChild();
		
		oc.parentMethod();

	}

}
