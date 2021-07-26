//?
public class SelfNumber2 {
	
	static int d[] = new int[10036]; //9999로 생성되는 최댓값이 10035임 

	public static void main(String[] args) {
		
		for(int i = 1; i <= 10000; i++) {
			d[dn(i)] = 1;
			if(d[i] != 1) {
				System.out.println(i);
			}
			
		}
	}
	
	static int dn(int i) {
		int res = i;
		String str = String.valueOf(res);
		for(int a = 0; a < str.length(); a++) {
			res += (str.charAt(a) - 48);
		}
		//System.out.println(res);
		return res += i;
	}

}
