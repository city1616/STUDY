/* import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		int n, total, count;
		double avg;
		int scores[] = new int[1000];

		for(int i = 0 ; i < c ; ++i){
			n = sc.nextInt();
			total = 0;
			count = 0;
			for(int j = 0 ; j < n ; ++j){
				scores[j] = sc.nextInt();
				total += scores[j];
			}
			avg = (double)total/n;

			for(int j = 0 ; j < n ; ++j){
				if(socres[j] > avg){
					count++;
				}
			}
			System.out.printf("%.3f", 100.0 * count / n);
			System.out.println("%");
		}
		sc.close();
	}
} */

/* import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double a[];
		double avg = 0;
		double sum = 0;

		for(int i = 0 ; i < n ; i++){
			int n = sc.nextInt();
			int index = 0;
			sum = 0;
			avg = 0;
			score = new double[n];
			a[] = new double[n];
			for(int j = 0 ; j < n ; j++){
				if(sc.hasNextInt()){
					a[j]=sc.nextInt();
					sum += a[j];
					score[j] = a[j];
				}
			}
			avg = sum/n;
			for(int k = 0 ; k < n ; k++){
				if(score[k]>avg){
					index++;
				}
			}
			double rate = (double)index/n*100;
			System.out.prinf("%.3f",rate);
			System.out.println("%");
		}
	}
} */

/* import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		double sum = 0;
		double avg = 0;
		double count = 0;

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [][] score = new int[n][];

		for(int i = 0 ; i < n ; i++){
			int k = sc.nextInt();
			score[i] = new int[k];
			for(int j = 0 ; j < k ; j++){
				score[i][j] = sc.nextInt();
			}
		}
		for(int i = 0 ; i < n ; i++){
			sum = 0;
			avg = 0;
			count = 0;
			for(int j = 0 ; j < score[i.length ; j++){
				if(avg < score[i][j]){
					count++
				}
			}
			System.out.printf("%.3f%%\n", (double)((count*100)/(score[i].length)));
		}
	}
} */

/* import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	static StringTokenizer st;
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		st = new StringTokenizer(br.readLine());

		int c = Integer.parseInt(st.nextToken());

		for(int i = 0 ; i < c ; i++){
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());

			int sum = 0;
			int[] student = new int[1000];
			int avg = 0;
			double superior = 0;
			for(int j = 0 ; j < n ; j++){
				int score = Integer.parseInt(st.nextToken());
				sum += score;

				student[j] = score;
			}
			avg = sum / n;

			for(int k = 0 ; k < student.length ; k++){
				if(student[k] > avg){
					superior++;
				}
			}
			double output = (superior/n)*100.00;
			System.out.printf("%.3f", output);
			System.out.println("%");
		}
	}
} */

/* import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		double avg;
		int[] grade;
		double[] ratio = new double[a];
		int b;
		int c;
		double sum;

		for(int i = 0 ; i < a ; i++){
			b=sc.nextInt();
			sum=0;
			c=0;
			grade = new int[b];
			for(int j = 0 ; j < b ; j++){
				grade[j] = sc.nextInt();
				sum += grade[j];
			}
			avg = (double)c/b*100;

			for(int j = 0 ; j < b ; j++){
				if(avg < grade[j]) 
					c++;
			}
			ratio[i]=(double)c/b*100;
		}
		for(int i = 0 ; i < a ; i++){
			System.out.println(String.format("%.3f", ratio[i]+"%"));
		}
	}
} */

/* import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		for(int i = 0 ; i < num ; i++){
			int sum = 0;
			float count = 0 ;
			int num = sc.nextInt();

			int[] student = new int[num];
			for(int j = 0 ; j < num ; j++){
				student[j] = sc.nextInt();
				sum += student[j];
			}
			int avg = sum/num;

			for(int a = 0 ; a < num ; a++){
				if(student[a]>avg){
					count++;
				}
			}
			System.out.printf("%.3f",(count/num)*100);
			System.out.println("%");
		}
	}
} */

/* import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n;
		int student = 0;
		int avg = 0;
		int total = 0;
		int score[];
		int count = 0;
		double rate[];

		n = sc.nextInt();
		rate = new double[n];

		for(int i = 0 ; i < n ; i++){
			student = sc.nextInt();
			score = new int[student];
			for(int j = 0 ; j < student ; j++){
				score[j] = sc.nextInt();
				total += score[j];
			}
			avg = total/student;

			for(int k = 0 ; k < student : k++){
				if(score[k] > avg){
					count++;
				}
			}
			rate[i] = ((double)count/student*100);
			count = 0;
			total = 0;
		}
		for(int i = 0 ; i < n ; i++){
			String str = String.format("%.3f", rate[i]);
			System.out.println(str + "%");
		}
	}
}

import java.util.Scanner;

public class test{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int score[] = new int[1000];             
        double avg[] = new double[1000];
        int c = sc.nextInt();                     
        for(int i = 0 ; i < c ; i++) {
            int sum = 0;                         
            int avg1 = 0;                     
            int sum1 = 0;                         
            int n = sc.nextInt();                 
            for(int j = 0 ; j < n ; j++) {
                score[j] = sc.nextInt();         
            }
            for(int k = 0 ; k < n ; k++) {    
                sum+=score[k];                   
            }
            avg1 = sum/n;                     
            for(int m = 0 ; m < n ; m++) {
                if(score[m] > avg1)
                    sum1++;
            }
            avg[i] = ((double)sum1/(double)n)*100;
        }
        for(int i = 0 ; i < c ; i++) {
            System.out.format("%.3f%%", avg[i]);
            System.out.println(); 
        }
    }
}*/

/*import java.io.*;

public class test {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a = Integer.parseInt(br.readLine());
		//int b = br.read();
		bw.write(a);
		bw.flush();
		bw.close();
		
		
	}
}*/

/*import java.util.Scanner;

public class test {
		
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int num1 = N / 100 % 10;
		int num2 = N / 10 % 10;
		int num3 = N % 10;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		
	}
}*/

public class test {
	public static void main(String[] args) {
		String star4 = "  *  \n * * \n*****";
		System.out.println(star4);
	}
}
