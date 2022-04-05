class Student2 {
	SchoolType1 school;
	public Student2(SchoolType1 school) {
		this.school = school;
	}
}

enum SchoolType1 {
	ELEMENTARY, MIDDLE, HIGH, UNIVERSITY
}

public class EnumTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SchoolType1[] schools = SchoolType1.values();
		
		for(SchoolType1 school : schools) {
			
			System.out.println(school + " : " + school.ordinal());
		}

	}

}
