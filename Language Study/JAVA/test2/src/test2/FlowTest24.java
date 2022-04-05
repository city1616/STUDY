package test2;

public class FlowTest24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		aaa : for(char c = 'A'; c <= 'C'; c++) {
			for(int x = 1; x <= 3; x++) {
				if(x == 2) continue;
				if(c == 'B') continue aaa;
				System.out.println("c = " + c + " , x = " + x);
			}
		}

	}

}
