package test2;

public class FlowTest16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 1;
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(num++ + "\t");
			}
			System.out.println();
		}
		num = 15;
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= (6-i); j++) {
				System.out.print(num-- + "\t");
			}
			System.out.println();
		}

	}

}
