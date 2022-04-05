import java.util.Scanner;

public class AlphabetFind {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String S = scan.next();
		int temp[] = new int[S.length()];
		
		for(int i = 0; i < S.length(); i++) {    // temp[]에 S단어의 아스키코드값 입력 
			temp[i] = S.charAt(i);
			
		}
		
		int al[] = new int[26];
		
		for(int i = 0; i < S.length() - 1; i++) {
			for(int j = i + 1; j < S.length(); j++) {
				if(temp[i] == temp[j]) {
					temp[j] = -1;
				}
			}
		}
		
		
		for(int j = 0; j < 26; j++) {
			al[j] = -1;
		}
		for(int i = 0; i < S.length(); i++) {
			
			for(int j = 97; j < 123; j++) {
				
				if(temp[i] == j) {
					al[j - 97] = i;
				}
			}
		}
		
		/*for(int i = 0; i < S.length(); i++) {    //S단어의 아스키코드값 출력 
			System.out.print(temp[i] + " ");     
		}*/
		
		//System.out.println();
		for(int i = 0; i < 26; i++) {
			System.out.print(al[i] + " ");
		}
	}

}
