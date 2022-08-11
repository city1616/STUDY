import java.io.*;
import java.util.*;

public class _12891_DNA_비밀번호 {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		String S = br.readLine();
		st = new StringTokenizer(br.readLine(), " ");
		int[] arr = new int[4];
		for(int i = 0; i < 4; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int front = 0;
		int rear = M - 1;
		int[] in = new int[4];
		int cnt = 0;
		for(int i = 0; i < N - M + 1; i++) {
			for(int j = front; j <= rear; j++) {
				if(S.charAt(j) == 'A') {
					in[0]++;
				} else if(S.charAt(j) == 'C') {
					in[1]++;
				} else if(S.charAt(j) == 'G') {
					in[2]++;
				} else if(S.charAt(j) == 'T') {
					in[3]++;
				} 
			}
			int chk = 0;
			for(int j = 0; j < 4; j++) {
				if(arr[j] == in[j]) {
					chk += 1;
				}
			}
			if(chk == 4) cnt++;
			
			if(S.charAt(front) == 'A') {
				in[0]--;
			} else if(S.charAt(front) == 'C') {
				in[1]--;
			} else if(S.charAt(front) == 'G') {
				in[2]--;
			} else if(S.charAt(front) == 'T') {
				in[3]--;
			} 
			rear++;
			if(S.charAt(rear) == 'A') {
				in[0]++;
			} else if(S.charAt(rear) == 'C') {
				in[1]++;
			} else if(S.charAt(rear) == 'G') {
				in[2]++;
			} else if(S.charAt(rear) == 'T') {
				in[3]++;
			} 
			front++;
			
		}
		System.out.println(cnt);
		
	}
	
}
