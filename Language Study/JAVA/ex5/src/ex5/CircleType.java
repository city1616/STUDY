package ex5;

class Circle {
	private int radius;
	private double extend;
	public Circle(int Newradius) {
		radius = Newradius;
	}
	
	public double getExtend() {
		return radius * radius * 3.14;
	}
	public double getCirc() {
		return 2 * 3.14 * radius;
	}
	public double getExchExtend() {
		radius = 5;
		return getExtend();
	}
	public double getExchCirc() {
		radius = 5;
		return getCirc();
	}
	
}

public class CircleType {

	public static void main(String[] args) {
		
		int r = Integer.parseInt(args[0]);
		Circle obj = new Circle(r);
		
		System.out.println("원의 면적 : " + obj.getExtend());
		System.out.println("원의 둘레 : " + obj.getCirc());
		System.out.println("원의 면적 : " + obj.getExchExtend());
		System.out.println("원의 둘레 : " + obj.getExchCirc());
	}

}
