package ex5;

class Box2 {
	int width;
	int height;
	int depth;
	public Box2() {
		width = 1;
		height = 1;
		depth = 1;
	}
	public Box2(int w) {
		width = w;
		height = 1;
		depth = 1;
	}
	public Box2(int w, int h) {
		width = w;
		height = h;
		depth = 1;
	}
	public Box2(int w, int h, int d) {
		width = w;
		height = h;
		depth = d;
	}
}

public class Overlo {

	public static void main(String[] args) {
		Box2 mybox1 = new Box2();
		Box2 mybox2 = new Box2(5);
		Box2 mybox3 = new Box2(5,10);
		Box2 mybox4 = new Box2(5,10,15);
		System.out.println("mybox1의 width = " + mybox1.width + "  height = " + mybox1.height + "  depth = " + mybox1.depth);
		System.out.println("mybox2의 width = " + mybox2.width + "  height = " + mybox2.height + "  depth = " + mybox2.depth);
		System.out.println("mybox3의 width = " + mybox3.width + "  height = " + mybox3.height + "  depth = " + mybox3.depth);
		System.out.println("mybox4의 width = " + mybox4.width + "  height = " + mybox4.height + "  depth = " + mybox4.depth);
		
	}

}
