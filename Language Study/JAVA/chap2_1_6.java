public class chap2_1_6 {
	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.println("나이, 몸무게, 키, 혈액형을 순서대로 입력하세요");

		byte age = s.nextByte();
		//BYTE

		int weight = s.nextInt();
		//정수INT

		double height = s.nextDouble();
		//실수형

		String blood = s.next();
		//문자열

		System.out.printf("나이 : %d, 몸무게 : %d", age, weight);
		System.out.printf("키 : %f, 혈액형 : %s", height, blood);

	}
}