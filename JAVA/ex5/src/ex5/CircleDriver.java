package ex5;

class Circle2 {
	private int radius;
	public Circle2(int radi) {
		radius = radi;
	}
	int getRadius() {
		return radius;
	}
	double computeArea() {
		return 3.14 * radius * radius;
	}
	double computePerimeter() {
		return 2.0 * 3.14 * radius;
	}
	void setRadius(int newRadius) {
		radius = newRadius;
	}
}

public class CircleDriver {

	public static void main(String[] args) {
		int radius;
		double area, perm;
		radius = Integer.parseInt(args[0]);
		Circle2 cir = new Circle2(radius);
		area = cir.computeArea();
		perm = cir.computePerimeter();
		System.out.println("원의 면적 : " + area);
		System.out.println("원의 둘레 : " + perm);
		cir.setRadius(5);
		area = cir.computeArea();
		perm = cir.computePerimeter();
		System.out.println("원의 면적 : " + area);
		System.out.println("원의 둘레 : " + perm);
	}

}
