package algo;

import java.io.*;
import java.util.*;

class Student implements Comparable<Student> {
	String  name;
	int kor;
	int eng;
	int math;
	
	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	@Override
	public int compareTo(Student o) {
		int r = -Integer.compare(kor, o.kor);
		if(r == 0) r = Integer.compare(eng, o.eng);
		if(r == 0) r = -Integer.compare(math, o.math);
		if(r == 0) r = name.compareTo(o.name);
		return r;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		// builder.append("Student [name=").append(name).append(", kor=").append(kor).append(", eng=").append(eng)
		// 		.append(", math=").append(math).append("]");
		builder.append(name);
		return builder.toString();
	}
	
}

public class _10825_국영수 {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		List<Student> students = new ArrayList<>();
		
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			String n = st.nextToken();
			int k = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			Student s = new Student(n, k, e, m);
			students.add(s);
		}
		
		// for(Student a : students) System.out.println(a);
		// System.out.println();
		
		Collections.sort(students);

		for(Student a : students) System.out.println(a);
	}
}
