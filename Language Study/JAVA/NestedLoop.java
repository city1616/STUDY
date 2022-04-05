public class NestedLoop {

	public static void main(String[] args) {

		int i, j, dan, su;

		for(i = 0; i <= 2; i++) {
			for(su = 0; su <= 9; su++) {
				for(j = 1; j <= 3; j++) {
					dan = 3 * i + j;
					System.out.print(dan + "*" + su + "=" + dan * su);
				}
				System.out.println();
			}
			System.out.println();
		}
		System.out.println();
	}
}