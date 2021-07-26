//stack미확

import myPackage.*;

public class InterfaceTest {

	public static void main(String[] args) {
		FixedStack mystack1 = new FixedStack(10);
		FixedStack mystack2 = new FixedStack(5);
		for(int i = 0; i < 10; i++) {
			mystack1.push(i);
		}
		for(int j = 0; j < 5; j++) {
			mystack2.push(j);;
		}
		for(int i = 0; i < 10; i++) {
			System.out.print(mystack1.pop()+ "  ");
		}
		System.out.println();
		for(int j = 0; j < 5; j++) {
			System.out.print(mystack2.pop() + "  ");
		}
		
	}

}
