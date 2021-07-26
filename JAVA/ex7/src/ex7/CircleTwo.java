package ex7;

class Point {
	double x, y;
	public Point() {
		setX(0);
		setY(0);
	}
	public Point (double po1, double po2) {
		 setX(po1);
		 setY(po2);
	}
	public double getXpoint() {
		return x;
	}
	public double getYpoint() {
		return y;
	}
	public void setX(double po1) {
		x = po1;
	}
	public void setY(double po2) {
		y = po2;
	}
	public void printpoint() {
		System.out.print("좌표 = " + "[ " + x + ", " + y + " ]");
	}
}

class Circle5 extends Point {
	double radius;
	
	public Circle5() {
		super(0.0, 0.0);
		radius = 0.0;
	}
	public Circle5(double po1, double po2, double rad) {
		super(po1, po2);
		radius = rad;
	}
	public double getRadius() {
		return radius;
	}
	public double getArea() {
		return Math.PI * getRadius() * getRadius();
	}
	public void printcircle() {
		System.out.println("	반지름 = " + radius);
		System.out.println("원의 넓이 = " + getArea());
	}
	
}

public class CircleTwo {

	public static void main(String[] args) {
		Circle5 cir = new Circle5(3.7, 4.2, 2.5);
		cir.printpoint();
		cir.printcircle();
		
	}

}
