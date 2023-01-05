package algo;

import java.io.*;

public class _1331_나이트투어 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean[][] visit = new boolean[6][6];
		boolean flag = true;
		// System.out.println('1' - 48);
		String S = br.readLine();
		int start_x = S.charAt(0) - 65;
		int start_y = S.charAt(1) - 49;
		int star_x = start_x;
		int star_y = start_y;
		visit[start_x][start_y] = true;
		int end_x = 0;
		int end_y = 0;
		for(int i = 0; i < 35; i++) {
			S = br.readLine();
			end_x = S.charAt(0) - 65;
			end_y = S.charAt(1) - 49;
			if(Math.abs(star_x - end_x) == 2 && Math.abs(star_y - end_y) == 1 ||
					Math.abs(star_x - end_x) == 1 && Math.abs(star_y - end_y) == 2) {
				if(visit[end_x][end_y]) flag = false;
				visit[end_x][end_y] = true;
			} else {
				flag = false;
			}
			star_x = end_x;
			star_y = end_y;
		}
		
		if(flag) {
			if(Math.abs(start_x - end_x) == 2 && Math.abs(start_y - end_y) == 1 ||
					Math.abs(start_x - end_x) == 1 && Math.abs(start_y - end_y) == 2) {
				System.out.println("Valid");
			} else {
				System.out.println("Invalid");	
			}
		}
		else System.out.println("Invalid");
	}
}
