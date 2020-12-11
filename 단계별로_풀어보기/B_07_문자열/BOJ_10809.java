package B_07_문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10809 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] ch = br.readLine().toCharArray();
		int[] al = new int[26];
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < al.length; i++) {
			al[i] = -1;
		}

		for (int i = 0; i < ch.length; i++) {
			int chNum = ch[i] - 'a';

			if (al[chNum] == -1) {
				al[chNum] = i;
			}
		}

		for (int i = 0; i < al.length; i++) {
			sb.append(al[i] + " ");
		}
		System.out.print(sb);

	}
}
