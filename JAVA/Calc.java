public class Calc {
	public static void main(String[] args) {
		int sum = 0;

		for(int i = 0; i < args.length; i++) {   //명령행 인자의 개수만큼 반복

			int n = Integer.parseInt(args[i]);   // 명령행 인자인 문자열을 정수로 변환
			sum += n;  // 숫자를 합한다.
		}

		System.out.println("sum = " + sum);
	}
}