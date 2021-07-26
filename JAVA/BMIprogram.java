
//비만도 프로그램

import java.util.Scanner;

public class BMIprogram {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("당신의 BMI를 계산합니다. ");

		System.out.println("신장을 입력해 주십시오 ( cm )");
		double height;
		height = scan.nextDouble();

		System.out.println("체중을 입력해 주십시오");
		double weight = scan.nextDouble();
		height = height / 100;

		System.out.println("성을 입력해 주십시오");
		String gender = scan.nextLine();

		double bmi;
		bmi = weight / (height * height);

		if (gender == "남자") {
			if (bmi < 20) {
				System.out.println("당신은 저체중 입니다");
			}
			else if (20 <= bmi && bmi < 25) {
				System.out.println("당신은 정상 입니다");
			}
			else if (bmi >= 25) {
				System.out.println("당신은 과체중 입니다");
			}
		}
		else if(gender == "여자") {
			if (bmi < 18.5) {
				System.out.println("당신은 저체중 입니다");
			}
			else if (18.5 <= bmi && bmi < 25) {
				System.out.println("당신은 정상 입니다");
			}
			else if (bmi >= 25) {
				System.out.println("당신은 과체중 입니다");
			}
		}
	}
}