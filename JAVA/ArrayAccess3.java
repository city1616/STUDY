public class ArrayAccess3 {
	public static void main(String[] args) {

		int array[][] = new int [2][3];

		for(int i = 0; i < array.length; i++) {

			for (int j = 0; j < array[i].length; j++) {

				array[i][j] = i * 3 + j;
				array[1][2] = 10;
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

	}
}