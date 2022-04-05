import java.util.Scanner;

public class OX {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int Case = scan.nextInt();                 //case 입력 
		
		String str[] = new String[Case];           // OX넣을 문자열 생성  
		for(int i = 0; i < Case; i++) {
			str[i] = scan.next();              // OX 입력  
		}
		
		int score[] = new int[Case];
		int coin = 0;
		
		for(int i = 0; i < Case; i++) {		
			
			for(int j = 0; j < str[i].length(); ++j) {
				if(str[i].charAt(j) == 'O') {
					score[i] += ++coin;
					//System.out.print(score[i] + " ");
				}
				else {
					coin = 0;
					//System.out.print(score[i] + " ");
				}
			}
			coin = 0;
			System.out.println();
		}
		for(int i = 0; i < Case; i++) {
			System.out.println(score[i]);
		}
	}
}
