class Student1 {
	SchoolType school;
	public Student1(SchoolType school) {
		this.school = school;
	}
}

enum SchoolType {
	ELEMENTARY, MIDDLE, HIGH, UNIVERSITY
}

public class EnumTest2 {

	public static void main(String[] args) {
		
		Student1 st1 = new Student1(SchoolType.ELEMENTARY);
		//Student st2 = new Student(2);
		
		System.out.println("상수 값을 출력한 경우");
		System.out.println("st1.school = " + st1.school);
		
		if(st1.school == SchoolType.ELEMENTARY) {
			System.out.println("st1.school == Student.ELEMENTARY로 비교했을 때");
			System.out.println("당신은 초등학생입니다.");
			
		}
		
		/*if(st2.school == SchoolType.MIDDLE) {
			System.out.println("st1.school == Student.MIDDLE로 비교했을 때");
			System.out.println("당신은 중학생입니다.");
			
		}*/
		
		/*if(st1.school == 1) {
			System.out.println("st1.school == 1 로 비교했을 때");
			System.out.println("당신은 초등학생입니다.");
			
		}*/
	}

}
