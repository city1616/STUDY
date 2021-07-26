package ex7;

abstract class Shape {
	abstract void draw();
}

class Circle extends Shape {
	void draw() {
		System.out.println("circle을 그리는 기능 ");
	}
}

class Rectangle extends Shape {
	void draw() {
		System.out.println("rectangle을 그리는 기능 ");
	}
}

class Triangle extends Shape {
	void draw() {
		System.out.println("Triangle을 그리는 기능 ");
	}
}


public class AbstractClass {

	public static void main(String[] args) {
		Circle c = new Circle();
		c.draw();
		Rectangle r = new Rectangle();
		r.draw();
		Triangle t = new Triangle();
		t.draw();
		
		Shape w = new Circle();
		w.draw();
		w = new Rectangle();
		w.draw();
		w = new Triangle();
		w.draw();
		
	}

}
