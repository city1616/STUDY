package test2;

public class FlowTest23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		char c = 'A';
		aaa : while(true) {
			while(true) {
				num++;
				System.out.print(c++ + " ");
				if(num % 5 == 0) {
					break;
				}
				if(num == 26) {
					break aaa;
				}
			}
			System.out.println();
		}

	}

}
