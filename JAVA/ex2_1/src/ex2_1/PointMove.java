package ex2_1;

class Point {
	int xPosition;
	int yPosition;
	
	void move(int x, int y) {
		xPosition = x;
		yPosition = y;
		
	}
}

public class PointMove {

	public static void main(String[] args) {
		
		Point point1 = new Point();
		
		point1.move(10, 10);
		System.out.print("x = " + point1.xPosition + "  y = " + point1.yPosition);
	}

}
