package ex5;

class Box5 {
	private int width;
	private int height;
	private int depth; //높이 
	private int vol; //면적 
	Box5(int a, int b, int c) {
		width = a;
		height = b;
		depth = c;
		this.volume();
	}
	private void volume() {
		vol = width * height * depth;
	}
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	public int getDepth() {
		return depth;
	}
	public int getVolume() {
		return vol;
	}
	public void setWidth(int w) {
		width = w;
	}
	public void setHeight(int h) {
		height = h;
	}
	public void setDepth(int d) {
		depth = d;
	}
	
}

public class MethodBox {

	public static void main(String[] args) {
		int vol;
		Box5 box1 = new Box5(10, 20, 20);
		vol = box1.getVolume();
		System.out.println("box1의 객체의 부피 = " + vol);
		System.out.println("box1의 객체의 높이 = " + box1.getHeight());
		
		
		}

}
