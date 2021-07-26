import java.util.Scanner;        //성공  

public class NumCir {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int i;
		i = 0;
		int a[] = new int[1000];
		int res[] = new int[1000];
		res[0] = N;
		
		while(true) {
			a[i] = res[i] / 10 + res[i] - (res[i] / 10 * 10);
			
			if(a[i] >= 10) {
				a[i] = a[i] - (a[i] / 10 * 10);
			}
			
			//System.out.println(a[i]);
			
			res[i + 1] = (res[i] - (res[i] / 10 * 10)) * 10 + a[i];
			
			//System.out.println(res[i + 1]);
			
			if(N ==  res[i + 1]) {
				break;
			}
			i++;
		}
		System.out.println(i + 1);
	}

}
