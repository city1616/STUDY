
public class CastingTest {
	
	//Casting Test
	
	public static void main(String[] args) {
		
		President president1 = new President();
		
		//president1 객체를 상의 클래스인 Person 클래스 레퍼런스 변수에 참조시킴 
		//president1 객체가 자동으로 Person타입으로 UpCasting되면서 참조됨 
		Person person1 = president1;
		
		//person1래퍼런스 변수의 참조 값을 President 타입의 레퍼런스 변수에 할당함
		//부모 클래스 타입의 참조 값을 자식 클래스 타입의 참조 변수에 할당하므로 명시적 캐스팅 
		President persident2 = (President)person1;
		
		//Person객체 생성 
		Person person2 = new Person();
		
		//Person 객체를 President 타입의 레퍼런스 변수에 참조시킴 
		President persident3 = (President)person2;
		
		//같은 부모 클래스를 상속받는 클래스 타입끼리 캐스팅 
		//Student student = (Student)president2;
		
	}

}