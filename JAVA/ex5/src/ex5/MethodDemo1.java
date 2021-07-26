package ex5;

class Fruit1 {
	private int a;
	private int s;
	private int g;
	private int sum;
	Fruit1(int apple, int straw, int grapes) {
		a = apple;
		s = straw;
		g = grapes;
		this.count();
	}
	private void count() {
		sum = a + s + g;
	}
	public int gettotal() {
		return sum;
	}
	public int getapple() {
		return a;
	}
	public int getstraw() {
		return s;
	}
	public int getgrapes() {
		return g;
	}
	public void setApple(int ap) {
		a = ap;
	}
}

public class MethodDemo1 {

	public static void main(String[] args) {
		int total;
		Fruit1 f1 = new Fruit1(30, 30, 30);
		total = f1.gettotal();
		System.out.println("객체 f1의 총 개수 = " +  total);
		System.out.println("객체 f1의 apple 개수 = " + f1.getapple());
		System.out.println("객체 f1의 straw 개수 = " + f1.getstraw());
		System.out.println("객체 f1의 grapes 개수 = " + f1.getgrapes());
		f1.setApple(100);
		System.out.println("객체 f1의 apple 개수 = " + f1.getapple());
		
	}

}
