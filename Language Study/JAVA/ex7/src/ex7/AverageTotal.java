package ex7;

class Avg1 {
	String name;
	int kor, eng;
	double avg;
	
	public Avg1(String na, int k, int  e) {
		name = na;
		kor = k;
		eng = e;
		avg = 0;
	}
	public double average() {
		avg = (kor + eng) / 2;
		return avg;
	}
	public double getAverage() {
		return avg;
	}
}

class Avg1Total extends Avg1 {
	double score;
	public Avg1Total(String na, int k, int e) {
		super(na, k, e);
		score = k + e;}
	
	public double total() {
		score = kor + eng;
		return score;
	}
	public double getTotal() {
		return score;
	}
}
public class AverageTotal {

	public static void main(String[] args) {
		Avg1Total student1 = new Avg1Total("김철수", 70, 80);
		Avg1Total student2 = new Avg1Total("김영희", 80, 90);
		double st1_avg = student1.average();
		double st2_avg = student2.average();
		double st1_total = student1.total();
		double st2_total = student2.total();
		
		System.out.println("이름 : " + student1.name + " 국어 = " + student1.kor + " 영어 = " + student1.eng);
		System.out.println("이름 : " + student1.name + " 평균 = " + student1.avg + " 총점 = " + student1.score);
		System.out.println("이름 : " + student2.name + " 국어 = " + student2.kor + " 영어 = " + student2.eng);
		System.out.println("이름 : " + student2.name + " 평균 = " + student2.avg + " 총점 = " + student2.score);
	}

}
