package ex3;

class G{
	int i, j;
}

public class InstanceOf {

	public static void main(String[] args) {
		
		G a = new G();
		
		if(a instanceof G) {
			System.out.println("a는 G클래스의 객체");
		}
		
	}

}
