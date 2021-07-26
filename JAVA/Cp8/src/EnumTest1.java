class Student {
	int school;
	public Student(int school) {
		this.school = school;
	}
	
	public static int ELEMENTARY = 1;
	public static int MIDDLE = 2;
	public static int HIGH = 3;
	public static int UNIVERSITY = 4;
	
}
public class EnumTest1 {
	
	//상수 사용 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st1 = new Student(Student.ELEMENTARY);
		Student st2 = new Student(2);
		//Student st3 = new Student();
		
		System.out.println("상수 값을 출력한 경우");
		System.out.println("st1.school = " + st1.school);
		System.out.println("st2.school = " + st2.school);
		
		if(st1.school == Student.ELEMENTARY) {
			System.out.println("st1.school == Student.ELEMENTARY로 비교했을 때");
			System.out.println("당신은 초등학생입니다.");
		}
		
		if(st1.school == 1) {
			System.out.println("st1.school == 1 로 비교했을 때");
			System.out.println("당신은 초등학생입니다.");
		}

	}

}
