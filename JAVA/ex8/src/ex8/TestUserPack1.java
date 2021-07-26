package ex8;

import myPackage.*;

public class TestUserPack1 {
	
	public static void main(String args[]) {
		FixedStack mystack1 = new FixedStack(10);
		FixedStack mystack2 = new FixedStack(5);
		for(int i = 0; i < 10; i++) {
				mystack1.push(i);
		}
		for(int i = 0; i < 5; i++) {
			mystack2.push(i);
		}
		System.out.println("스택 : mystack1");
		for(int i = 0; i < 10; i++) {
			System.out.print(mystack1.pop() + "  ");
		}
		System.out.println();
		System.out.println("스택 : mystack2");
		
		for(int i = 0; i < 5; i++) {
			System.out.print(mystack2.pop() + "  ");
		}
		
	}

}
