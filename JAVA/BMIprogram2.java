
//비만도 프로그램

import java.util.Scanner;

public class BMIprogram2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("당신의 BMI를 계산합니다. ");

		System.out.println("신장을 입력해 주십시오 ( cm )");
		double height;
		height = scan.nextDouble();

		System.out.println("체중을 입력해 주십시오");
		double weight = scan.nextDouble();
		height = height / 100;

		System.out.println("성을 입력해 주십시오(남자면 1, 여자면 2)");
		int gender = scan.nextInt();

		double bmi;
		bmi = weight / (height * height);

		if (gender == 1) {
			if (bmi < 20) {
				System.out.println("당신은 저체중 입니다");
			}
			else if (20 <= bmi && bmi < 23) {
				System.out.println("당신은 정상 입니다");
			}
			else if (bmi <= 23 && bmi < 25) {
				System.out.println("당신은 과체중 입니다");
			}
			else if (bmi <= 25 && bmi < 30) {
				System.out.println("당신은 비만 입니다");
			}
			else if (bmi >= 30) {
				System.out.println("당신은 고도비만 입니다");
			}
		}
		else if(gender == 2) {
			if (bmi < 18.5) {
				System.out.println("당신은 저체중 입니다");
			}
			else if (18.5 <= bmi && bmi < 23) {
				System.out.println("당신은 정상 입니다");
			}
			else if (bmi <= 23 && bmi < 25) {
				System.out.println("당신은 과체중 입니다");
			}
			else if (bmi <= 25 && bmi < 30) {
				System.out.println("당신은 비만 입니다");
			}
			else if (bmi >= 30) {
				System.out.println("당신은 고도비만 입니다");
			}
		}
	}
}