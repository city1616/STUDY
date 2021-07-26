public class IrregularArray2 {
	public static void main(String[] args) {

		int i[][] = { {0, 1, 2, 3}, {4}, {5}, {6, 7, 8, 9} };

		for(int k = 0; k < i.length; k++) {
			for(int j = 0; j < i[k].length; j++) {
				System.out.print(i[k][j] + " ");
			}
			System.out.println();
		}
	}
}