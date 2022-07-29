package algo;

class Test {
	long sum(int[] a) {
		long total = 0;
		for(int n : a) total += n;
		return total;
	}
}

public class _15596_정수_N개의_합 {
	public static void main(String[] args) {
		Test t = new Test();
		// int[] arr = {1, 2, 3};
		// t.sum(arr);
		// System.out.println(t.sum(arr));
	}
}

