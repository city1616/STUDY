import java.util.Scanner;
import java.util.Arrays;

public class WordStudyMaxAlphabet {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String S = scan.next();
		char alpha[] = new char[S.length()];
		int arr[][] = new int[2][26];
		int result[] = new int[26];
		int max = 0;
		int Max = 0;
		
		
		for(int i = 0; i < S.length(); i++) {     //alpha배열에 S 문자 하나씩 입력  
			alpha[i] = S.charAt(i);
		}
		
		/*
		for(int i = 0; i < S.length(); i++) {
			System.out.print(alpha[i]);
		}
		System.out.println();
		*/
		for(int i = 0; i < 2; i++) {           //배열 초기화  
			for(int j = 0; j < 26; j++) {
				arr[i][j] = 0;
			}
		}
		for(int a = 0; a < alpha.length; a++) {
			for(int i = 65; i < 91; i++) {         //대문자 배열 입력 
				if(alpha[a] == i) {
					arr[0][i - 65] += 1;
				}
			}
		}
		
		for(int a = 0; a < alpha.length; a++) {
			for(int i = 97; i < 123; i++) {         //소문자  배열 입력  
				if(alpha[a] == i) {
					arr[1][i - 97] += 1;
				}
			}
		}
	
		for(int i = 0; i < 2; i++) {             //result[] 에 arr[]의 값을 더함      
			for(int j = 0; j < 26; j++) {
				result[j] += arr[i][j];
			}
		}
		/*for(int i = 0; i < 26; i++) {          //result[] 출력  
			System.out.print(result[i]);
		}
		System.out.println();
		
		for(int i = 0; i < 2; i++) {           //arr[] 배열 출력  
			for(int j = 0; j < 26; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}*/
	
		for(int i = 65; i < 91; i++) {
			if(result[i - 65] > max) {
				max = result[i - 65];
				Max = i;
			}
		}
		
		
		Arrays.sort(result);
		if(result[25] == result[24]) {
			System.out.println("?");
		}
		else {
			System.out.println((char)Max);
		}
	}

}
