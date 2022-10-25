package algo;

public class _4673_셀프_넘버 {
	public static void main(String[] args) {
		boolean[] check = new boolean[10001]; // 1 ~ 10000
	
		for(int i = 1; i < 10001; i++) {
			int n = d(i);
			
			if(n < 10001) { // 10000이 넘는 수는 필요 없음
				check[n] = true;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 1; i < 10001; i++) {
			if(!check[i]) { // false인 인덱스만 출력
				sb.append(i + "\n");
			}
		}
		System.out.println(sb);
	}
	
	public static int d(int number) {
		int sum = number;
		
		while(number != 0) {
			sum += number % 10; // 첫 째 자리수 
			number /= 10; // 10을 나누어 첫 째 자리를 없앤다.
			
		}
		
		return sum;
	}
}
