package ex5;

public class NameDriver {

	public static void main(String[] args) {
		Name person1, person2;
		person1 = new Name(args[0], args[1]);
		System.out.println("성 : " + person1.getLastName() + "  이름 : " + person1.getFirstName());
		System.out.println("이름의 길이 : " + person1.getLength());
		person2 = new Name(args[2], args[3]);
		System.out.println("성 : " + person2.getLastName() + "  이름 : " + person2.getFirstName());
		System.out.println("이름의 길이 : " + person1.getLength());
	}

}

class Name {
	private String LastName;
	private String FirstName;
	public Name(String NewLastName, String NewFirstName) {
		LastName = NewLastName;
		FirstName = NewFirstName;
	}
	public String getLastName() {
		return LastName;
	}
	public String getFirstName() {
		return FirstName;
	}
	public int getLength() {
		return LastName.length() + FirstName.length();
	}
	
}
