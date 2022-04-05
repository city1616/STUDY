package ex8;

interface IStack {
	void push(int item);
	int pop();
}
class FixedStack implements IStack {
	private int stack[];
	private int t;
	FixedStack(int size) {
		stack = new int[size];
		t = -1;
	}
	public void push(int item) {
		if(t == stack.length-1)
			System.out.println("스택이 꽉찼음");
		else
			stack[++t] = item;
	}
	public int pop() {
		if(t<0) {
			System.out.println("스택이 비었음");
			return 0;
		}
		else
			return stack[t--];
	}
}
public class Stackpop {

	public static void main(String[] args) {
		FixedStack mystack1 = new FixedStack(10);
		FixedStack mystack2 = new FixedStack(5);
		for(int i = 0; i < 10; i++)
			mystack1.push(1);
		for(int i = 0; i < 10; i++)
			mystack2.push(1);
		
	}

}
