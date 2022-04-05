import java.util.Scanner;  //성공 

public class Score {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int score = scan.nextInt();
		String level;
		
		if(score >= 90) {
			level = "A";
		}
		else if(score >= 80) {
			level = "B";
		}
		else if(score >= 70) {
			level = "C";
		}
		else if(score >= 60) {
			level = "D";
		}
		else {
			level = "F";
		}
		System.out.println(level);
	}

}
