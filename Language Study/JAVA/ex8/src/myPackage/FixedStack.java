package myPackage;

public class FixedStack implements IStack {
	private int stack[];
	private int t;
	public FixedStack(int size) {
		stack = new int[size];
		t = -1;
	}
	public void push(int item) {
		if(t == stack.length-1) {
			System.out.println("스택이 짝찾음 ");
		}
		else
			stack[++t] = item;
	}
	public int pop() {
		if( t < 0) {
			System.out.println("스택이 비었음 ");
			return 0;
		}
		else 
			return stack[t--];
	}

}
