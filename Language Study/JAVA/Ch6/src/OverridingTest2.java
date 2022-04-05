class OverridingParent2 {
	int money = 20;
	void parentMethod() {
		System.out.println("parent method");
	}
}

class OverridingChild2 extends OverridingParent2 {
	String money = "20원 ";
	void parentMethod() {
		System.out.println("overriding method");
	}
}

public class OverridingTest2 {
	
	//변수 재정의 테스트 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OverridingChild2 oc2 = new OverridingChild2();
		
		oc2.money = "30원 ";
		//oc2.money = 30;
		
		System.out.println("oc2.money = " + oc2.money);
		
	}

}
