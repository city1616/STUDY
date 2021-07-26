package home2;

public class home2_1 {

	public static void main(String[] args) {

		String str = args[0];
		char ch;
		ch = str.charAt(0);

		if(ch == 'Y' && ch == 'y')
			System.out.print("YES");
		else if(ch == 'N' && ch == 'n')
			System.out.print("NO");
		else
			System.out.print("입력 오류");
	}
}

