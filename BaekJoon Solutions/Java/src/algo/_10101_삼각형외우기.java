package algo;

import java.io.*;

public class _10101_삼각형외우기 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        if(A + B + C == 180) {
            if(A == 60 && B == 60 && C == 60) System.out.println("Equilateral");
            else if(A == B || A == C || B == C) System.out.println("Isosceles");
            else System.out.println("Scalene");
        } else {
            System.out.println("Error");
        }
        br.close();
    }
}
