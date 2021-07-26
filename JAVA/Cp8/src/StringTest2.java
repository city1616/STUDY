
public class StringTest2 {
	
	//String 클래스의 불변성 테스트 
	
	public static void main(String[] args) {
		
		String originalString = new String("Java");
		String lastString = originalString.concat("Fighting");
		
		System.out.println("originalString == lastString : " + (originalString == lastString));
		
	}

}
