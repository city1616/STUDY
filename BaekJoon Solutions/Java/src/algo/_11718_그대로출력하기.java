package algo;

import java.io.*;
import java.util.*;

public class _11718_그대로출력하기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String line;
		while((line = br.readLine()) != null) {
			if(line == null || line.isEmpty()) break;
			sb.append(line).append("\n");
		}
		System.out.print(sb);
		br.close();
	}
}
