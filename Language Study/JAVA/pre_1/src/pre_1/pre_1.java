package pre_1;

/*class House {
	int price;
	String dong;
	int size;
	String kind;
	
	public House() {
		this(100, 32, "abc", "def");
	}
	public House(int price) {
		this(price, 32, "abc", "def");
	}
	public House(int price, int size) {
		this(price, size, "abc", "def");
		}
	public House(int price, int size, String dong) {
		this(price, size, dong, "def");
	}
	public House(int price, int size, String dong, String kind) {
		this.price = price;
		this.size = size;
		this.dong = dong;
		this.kind = kind;
	}
	
}*/

public class pre_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a, c;
		double b = 3.2225235235235235;
		
		a = 3;
		
		System.out.println("a = " + a);
			
		System.out.printf("%3s", "s");
		
		System.out.println();	
		
		System.out.println(Math.pow(10, 2));
		
		double d = 2.352;
		//double w = Double.parseDouble(String.format("%.2",  d));
		//System.out.println(w);
		
		/*int q = 26;
		System.out.println(q / 10 * 10);
		
		int t[][] = new int[a][];
		System.out.println(t[a].length);*/
		
		int multiArray[][] = new int[2][];
		multiArray[0] = new int[2];
		multiArray[1] = new int[1];
		
		/* 소수점 표 -AverageTestCaes.java
		 * 소수점 표시 #으로 표시할 경우 제일 마지막에 0은 출력 안됨, 0으로 표시할 경우 마지막에 0까지 표시됨. 반올림됨.
		 * import java.text.DecimalFormat;
		 * DecimalFormat form = new DecimalFormat(".00");
		 * System.out.print("결과="+df.format(a));
		 * */
		
		double count = Math.pow(10, 2);
		double num = Math.round(b * count) / count;
		//double result = num.toFixed(2);
		System.out.println(count);
		System.out.println(num);
	}

}
