package ex5;

class Box3 {
	int width;
	int height;
	int depth;
	public Box3() {
		this(1, 1, 1);
	}
	public Box3(int w) {
		this(w, 1, 1);
	}
	public Box3(int w, int h) {
		this(w, h, 1);
	}
	public Box3(int w, int h, int d) {
		width = w;
		height = h;
		depth = d;
	}
}

public class Overloe {

	public static void main(String[] args) {
		Box3 mybox1 = new Box3();
		Box3 mybox2 = new Box3(5);
		Box3 mybox3 = new Box3(5,10);
		Box3 mybox4 = new Box3(5,10,15);
		System.out.println("mybox1의 width = " + mybox1.width + "  height = " + mybox1.height + "  depth = " + mybox1.depth);
		System.out.println("mybox2의 width = " + mybox2.width + "  height = " + mybox2.height + "  depth = " + mybox2.depth);
		System.out.println("mybox3의 width = " + mybox3.width + "  height = " + mybox3.height + "  depth = " + mybox3.depth);
		System.out.println("mybox4의 width = " + mybox4.width + "  height = " + mybox4.height + "  depth = " + mybox4.depth);
		
	}

}
