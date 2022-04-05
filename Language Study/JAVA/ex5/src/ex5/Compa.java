package ex5;
import java.util.Scanner;

class Overload3 {
	public int Max(int a, int b) {
		int max;
		if(a > b) {
			max = a;
		}
		else {
			max = b;
		}
		return max;
		
	}
	public double Max(double a, double b) {
		double max;
		if(a > b) {
			max = a;
		}
		else {
			max = b;
		}
		return max;
	}
	
}

public class Compa {

	public static void main(String[] args) {
		Double num1, num2;
		double highnum;
		Scanner scan1 = new Scanner(System.in);
		num1 = scan1.nextDouble();
		num2 = scan1.nextDouble();
		Overload3 obj = new Overload3();
		highnum = obj.Max(3, 5);
		System.out.println("max = " + highnum);
		highnum = obj.Max(4.3, 44.2);
		System.out.println("max = " + highnum);
		highnum = obj.Max(num1, num2);
		System.out.println("max = " + highnum);
		
	}

}
