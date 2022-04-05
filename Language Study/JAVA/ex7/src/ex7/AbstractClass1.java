package ex7;

abstract class Shape1 {
	public String name;
	public Shape1(String na) {
		name = na;
	}
	public String getName() {
		return name;
	}
	public abstract double getArea();
}

class Circle6 extends Shape1 {
	private int radius;
	public Circle6(String na, int ra) {
		super(na);
		radius = ra;
	}
	public double getArea() {
		return (Math.PI * radius * radius);
	}
}
class Rectangle1 extends Shape1 {
	private int length;
	private int width;
	public Rectangle1(String na, int le, int wi) {
		super(na);
		length = le;
		width = wi;
	}
	public double getArea() {
		return (length * width);
	}
}

class Triangle1 extends Shape1 {
	private int height;
	private int width;
	public Triangle1(String na, int he, int wi) {
		super(na);
		height = he;
		width = wi;
	}
	public double getArea() {
		return (height*width)/2;
	}
	

}
public class AbstractClass1 {

	public static void main(String[] args) {
		int na;
		Shape1 w = new Circle6("원", 3);
		w.getArea();
		System.out.println("원의 넓이 = " + w.getArea());
		w = new Rectangle1("직사각형", 2, 4);
		w.getArea();
		System.out.println("직사각형의 넓이 = " + w.getArea());
		w = new Triangle1("삼각형", 2, 4);
		w.getArea();
		System.out.println("삼각형의 넓이 = " + w.getArea());
		
		
	}

}
