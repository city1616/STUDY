import java.util.Scanner;
import java.util.Arrays;

public class GroupWord2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		String word[] = new String[N];
		int result = 0;
		
		for(int i = 0; i < N; i++) {		//단어입력
			word[i] = scan.next();
		}
		for(int j = 0; j < N; j++) {		//단어출력 
			System.out.println(word[j]);
		}
		for(int a = 0; a < N; a++) {
			for(int b = 0; b < word[a].length(); b++) {
				for(int c = 0; c < word[a].length(); c++) {
					if(word[a].charAt(b) != word[a].charAt(c)) {
						
					}
				}
				if(word[a].charAt(b) == word[a].charAt(b + 1)) {
					break;
				}
			}
			result += 1;
		}
		System.out.println(result);
		
		
	}
			
}
