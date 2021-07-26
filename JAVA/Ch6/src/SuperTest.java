class Sawon {
	
	String name;
	String dept;
	int salary;
	
	String displayInfo() {
		return "이름 : " + name + ", 부서 : " + dept + ", 연봉 : " + salary;
	}
}

class Sales extends Sawon {
	
	int commition;
	
	/*String displayInfo() {
		return "이름 : " + name + ", 부서 : " + dept + ", 연봉 : " + salary + ", 수당 : " + commition;
	}
	*/
	
	String displayInfo() {
		return super.displayInfo() + ", 수당 : " + commition;
	}
	
}
public class SuperTest {
	
	//Super 테스트 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sales sales = new Sales();
		System.out.println(sales.displayInfo());

	}

}
