package algo;

import java.io.*;
import java.util.*;

public class _1152_단어의_개수 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		System.out.println(st.countTokens());
	}
}
