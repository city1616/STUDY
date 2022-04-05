package test2;

public class FlowTest10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		String exp = "";
		
		for(int i = 0; i <= 50; i++) {
			sum += i;
			exp += (i == 0) ? "" + i : " + " + i;
		}
		
		System.out.println(exp + " = " + sum);

	}

}
