package ex5;

class Boxt {
	int width;
	int height;
	int depth;
	Boxt(int num1, int num2, int num3) {
		width = num1;
		height = num2;
		depth = num3;
	}
	Boxt change(Boxt obj2) {
		obj2.width = 20;
		obj2.height = 30;
		obj2.depth = 40;
		return obj2;
	}
}

public class FindEver {

	public static void main(String[] args) {
		Boxt obj3;
		Boxt obj = new Boxt(2, 3, 4);
		obj3 = obj.change(obj);
		System.out.println("obj3.width = " + obj3.width);
	}

}
