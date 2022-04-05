class Args {
	int x;
	
	void add(int x) {
		x += 50;
		//System.out.println(x);
	}
	void add(Args arg) {
		arg.x += 40;
	}
	void addNew(Args args) {
		args = new Args();
	}
	void add(int[] arry) {
		arry[0]++;
	}
}
public class ArgsTest {
	//인수 전달 방식 테스트 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Args arg = new Args();
		arg.x = 100;
		int[] arr = new int[1];
		int a = 0;
		
		//arg.add(a);
		//System.out.println("a = " + a);
		
		arg.add(arg.x);
		System.out.println("arg.x = " + arg.x);
		
		arg.add(arg);
		System.out.println("arg.x = " + arg.x); 
		
		arg.addNew(arg);
		System.out.println("arg.x = " + arg.x);
		
		arg.add(arr);
		System.out.println("arr[0] = " + arr[0]);
		
		
	}

}
