package algo;

import java.io.*;
import java.util.*;

public class _10814_나이순정렬 {

	static class P implements Comparable<P> {
		int age;
		String name;

		public P(int age, String name) {
			this.age = age;
			this.name = name;
		}

		@Override
		public int compareTo(P o) {
			// if(this.age == o.age) return this.name.compareTo(o.name);
			return Integer.compare(this.age, o.age);
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		P[] people = new P[N];
		
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int age = Integer.parseInt(st.nextToken());

			String name = st.nextToken();
			people[i] = new P(age, name);
		}

		Arrays.sort(people);

		for(int i = 0; i < N; i++) {
			sb.append(people[i].age).append(" ").append(people[i].name).append("\n");
		}

		System.out.print(sb);
		br.close();
	}
}
