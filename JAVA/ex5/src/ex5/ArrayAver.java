package ex5;

class FindArray {
	double getSum(int arr1[]) {
		int sum = 0;
		for(int i = 0; i < arr1.length; i++) {
			sum += arr1[i];
		}
		return sum;
	}
	double getAverage(int w[]) {
		double aver;
		double sum = 0;
		sum = getSum(w);
		aver = sum / w.length;
		return aver;
	}
	
}

public class ArrayAver {

	public static void main(String[] args) {
		int arr[] = new int[4];
		for(int i = 0; i < 4; i++) {                      //int arr[] = {1, 2, 3, 4}; 배열 초기화 
			arr[i] = Integer.parseInt(args[i]);
		}
		FindArray obj = new FindArray();
		double sum = 0;
		double aver;
		sum = obj.getSum(arr);
		aver = obj.getAverage(arr);
		
		System.out.println("배열의 총합 : " + sum);
		System.out.println("배열의 평균 : " + aver);
		
	}

}
