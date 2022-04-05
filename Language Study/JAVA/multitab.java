import java.util.Scanner;

class Multi {

	Scanner scan = new Scanner(System.in);

	int tmp;

	public void Asort {                                               //a[i]를 내림차순 정렬
		for(int i = 0; i <= a.length - 1; i++) {
			if(array[i] < array[i + 1]) {
				tmp = array[i];
				array[i] = array[i + 1];
				array[i + 1] = tmp;
			}
		}
	}

	public void Bsort {   											//b[j]를 내림차순 정렬 
		for(int j = 0; j <= b.length - 1; j++) {
			if(array[j] < array[j + 1]) {
				tmp = array[j];
				array[j] = array[j + 1];
				array[j + 1] = tmp;
			}
		}
	}

	
}

public class multitab {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n, m;
		int AMax = 0, BMax = 0, tmp = 0;

		System.out.print("A멀티탭과 B멀티탭의 개수를 입력하세요 : ");         //A멀티탭과 B멀티탭이 개수를 입력
		int n = nextInt();
		int m = nextInt();
		System.out.println();

		int [] a = new int[n];
		int [] b = new int[m];


		for(int i = 0; i <= a.length - 1; i++) {                        //A멀티탭의 콘센트의 개수    
			int a[i] = scan.nextInt();
		}

		System.out.println();

		for(int j = 0; j <= b.length - 1; j++) {                        //B멀티탭의 콘센트의 개수   
			int b[j] = scan.nextInt();
		}

		for(i = 0; i <= a.length - 1; i++) {							//a[i]를 내림차순으로 정렬 
			if(a[i] < a[i + 1]) {
				tmp = a[i];
				a[i] = a[i + 1];
				a[i + 1] = tmp;
			}
		}

		for(j = 0; j <= b.length - 1; j++) {							//b[j]를 내림차순으르 정렬 
			if(b[j] < b[j + 1]) {
				tmp = b[j];
				b[j] = b[j + 1];
				b[j + 1] = b[j];
			}
		}

		/*
		for(i = 0; i <= a.length - 1; i++) {                            //A멀티탭의 콘센트개수 a[i]가 가장 큰 값 = amax
			int amax = 0; 												//a[i]의 최대값
			if(amax < a[i]) {
				amax = a[i];
			}
		}

		for(j = 0; j <= b.length - 1; j++) {                            //B멀티탭의 콘센트개수 b[j]가 가장 큰 값 = bmax
			int bmax = 0;												//b[j]의 최대값 
			if(bmax < b[j]) {
				bmax = b[j];
			}
		}
		*/
		
		if(a[0] >= m) {													//a[i]의 최대값인 max와 m 비교했을때 max와 m이 같거나 max가 더 크면 최대 컴퓨터를 입력할수 있는 최대값은 b[j]의 총합
			for(int j = 0; j <= b.length - 1; j++) {
				result += b[j];
			}
		}

		if(n > m) {           											//A멀티탭의 개수가 B멀티탭의 개수보다 많을때 
			
		}



	}
}




