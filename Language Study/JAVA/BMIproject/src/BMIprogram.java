//비만도 프로그램

import java.util.Scanner;

class Person {
	
	Scanner std = new Scanner(System.in);

	double height;
	double weight;
	int gender;
	double bmi;
	double standweight;
	double blood;
	double water;
	
	public double Bmi() {
		height = chheight();
		bmi = weight / (height * height);
		return bmi;
	}
	public void Gender() {
	 if(gender == 1) {
		 System.out.println("성별 : 남자");
	 }
	 else {
		 System.out.println("성별 : 여자");
	 }
	}
 
	public void standweight() {
		standweight = chheight() * chheight() * 21;
		System.out.println("당신의 표준체중은 : " + standweight + "kg  입니다.");
	}
	public double getheight() {
		return height;
	}
	public double chheight() {
		return height / 100;
	}
	public double getweight() {
		return weight;
	}
	
	public double getwater() {
		return (weight * 0.6); // 체중의 60%가 
	}
 
	public void bmical() {
		if (gender == 1) {
			if (bmi < 20) {
				System.out.println("당신은 저체중 입니다");
			}
			else if (bmi >= 20 && bmi < 23) {
				System.out.println("당신은 정상 입니다");
			}
			else if (bmi >= 23 && bmi < 25) {
				System.out.println("당신은 과체중 입니다");
			}
			else if (bmi >= 25 && bmi < 30) {
				System.out.println("당신은 비만 입니다");
			}
			else {
				System.out.println("당신은 고도비만 입니다");
			}
		}
		else if(gender == 2) {
			if (bmi < 18.5) {
				System.out.println("당신은 저체중 입니다");
			}
			else if (bmi >= 18.5 && bmi < 23) {
				System.out.println("당신은 정상 입니다");
			}
			else if (bmi >= 23 && bmi < 25) {
				System.out.println("당신은 과체중 입니다");
			}
			else if (bmi >= 25 && bmi < 30) {
				System.out.println("당신은 비만 입니다");
			}
			else {
				System.out.println("당신은 고도비만 입니다");
			}
		}
	}
	public double bloodvol() {
		if(gender == 1) {
			blood = weight * 80;
		}
		else if(gender == 2) {
			blood = weight * 70;
		}
		return blood;
	}
	public void printbmi() {
		System.out.println("당신의 BMI를 계산합니다. ");
		System.out.println("신장을 입력해 주십시오 ( cm )");
		height = insert();
		
		System.out.println("체중을 입력해 주십시오");
		weight = insert();
		
		System.out.println("성별을 입력해 주십시오(남자면 1, 여자면 2)");
		gender = inserti();
		
		Gender();
		System.out.println("신장 : " + getheight() + "cm  체중 : " + weight  + "kg  BMI : " + Bmi());

		bmical();
		System.out.println();
	}
	public void printstdweight() {
		System.out.println("신장을 입력해 주십시오 ( cm )");
		height = insert();
		
		standweight();
		System.out.println();
	}
	public void printblood() {
		System.out.println("체중을 입력해 주십시오. ");
		weight = insert();
		System.out.println("성별을 입력해 주십시오(남자면 1, 여자면 2)");
		gender = inserti();
		
		Gender();
		blood = bloodvol();
		System.out.println("인체의 혈액량 = " + blood + " ml");
		System.out.println();
	}
	public void printwater() {
		System.out.println("체중을 입력해 주십시오. ");
		weight = insert();
		
		water = getwater();
		System.out.println("인체의 수분의 양 = " + water + " ml");
		System.out.println();
	}
	public double insert() {
		return std.nextDouble();
	}
	public int inserti() {
		return std.nextInt();
	}
}

public class BMIprogram {

 public static void main(String[] args) {
  
  Scanner std = new Scanner(System.in);
  Person person1 = new Person();
  Person person2 = new Person();
  int i;
  int end = 1;
  
  while(end == 1) {
	  System.out.println("***************");
	  System.out.println("1 - bmi 계산");
	  System.out.println("2 - 표준체중 계산");
	  System.out.println("3 - 혈액량 계산  ");
	  System.out.println("4 - 수분의 양 계산  ");
	  System.out.println("5 - 종료 ");
	  System.out.println("***************");
	  System.out.println("번호를 입력하세요.");
	  i = std.nextInt();
  
	  switch(i) {
	  case 1 :
		  person1.printbmi();
		  break;
	  case 2 :
		  person1.printstdweight();
		  break;
	  case 3 :
		  person1.printblood();
		  break;
	  case 4 :
		  person1.printwater();
		  break;
	  case 5 :
		 end = 0;
		  break;
	  default :
		  System.out.println("입력이 잘못되었습니다. ");
			  
	  }
  }
  
  System.out.println();
  
 }
 
} 