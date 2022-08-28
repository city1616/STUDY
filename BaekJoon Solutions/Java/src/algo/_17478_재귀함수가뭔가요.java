package algo;

import java.io.*;

public class _17478_재귀함수가뭔가요 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Test(N, N);
	}
	
	public static void Test(int n, int k) {
		if(n == k) System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
		String fL = "\"재귀함수가 뭔가요?\"";
		String nextL = "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어."; 
		String nextL2 = "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지."; 
		String nextL3 = "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"";
		String nextL4 = "\"재귀함수는 자기 자신을 호출하는 함수라네\"";
		String eL = "라고 답변하였지.";
		
		for(int i = 0; i < n - k; i++) {
			fL = "____" + fL;
			nextL = "____" + nextL;
			nextL2 = "____" + nextL2;
			nextL3 = "____" + nextL3;
			nextL4 = "____" + nextL4;
			eL = "____" + eL;
		}
		
		System.out.println(fL);
		
		if(k == 0) {
			System.out.println(nextL4);
			System.out.println(eL);
			return;
		}
		
		System.out.println(nextL);
		System.out.println(nextL2);
		System.out.println(nextL3);
		
		Test(n, k - 1);
		
		System.out.println(eL);
	}
}
