import java.util.Scanner;

public class chap2_1_7 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("나이, 몸무게, 키, 혈액형을 순서대로 입력하세요.");

		byte age = s.nextByte();

		int weight = s.nextInt();

		double height = s.nextDouble();

		String blood = s.next();

		System.out.printf("나이 : %d, 몸무게 : %d\n", age, weight);
		System.out.printf("키 : %.2f, 혈액형 : %s\n", height, blood);
		
	}
}