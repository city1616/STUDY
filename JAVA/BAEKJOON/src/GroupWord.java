import java.util.Scanner;
import java.util.Arrays;

public class GroupWord {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		String word[] = new String[N];
		int result[] = new int[N];
		
		for(int i = 0; i < N; i++) {			//word배열 입력   	
			word[i] = scan.next();
			result[i] = 1;
		}
		
		for(int j = 0; j < N; j++) {     		//word배열 출력  
			System.out.println(word[j]);
		}
		
		for(int a = 0; a < N; a++) {
			//Arrays.sort(Integer.parseInt(word[a]));
			for(int b = 0; b < word[a].length() - 1; b++) {
				if(word[a].charAt(b) != word[a].charAt(b + 1)) {
					for(int i = b; i < word[a].length(); i++) {
						if(word[a].charAt(b) == word[a].charAt(i)) {
							result[a] = 0;
						}
					}
				}
			}
		}
		for(int i = 0; i < N; i++) {
			System.out.println(result[i]);
		}
		
	}

}
