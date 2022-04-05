
public class StringTest3 {

	//StringBuffer 테스트 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("Java");
		StringBuffer sb2 = sb.append(" Fighting");
		System.out.println("sb == sb2 : " + (sb == sb2));
		
		System.out.println(sb);
		System.out.println(sb2);

	}

}
