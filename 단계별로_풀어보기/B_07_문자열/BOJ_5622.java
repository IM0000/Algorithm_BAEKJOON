package B_07_문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_5622 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int count = str.length();
		int result = 0;
		for (int i = 0; i < count; i++) {
			if (str.charAt(i) < 'S') {
				result += (str.charAt(i) - 'A' + 9) / 3;
			} else if (str.charAt(i) == 'S') {
				result += 8;
			} else if ('S' < str.charAt(i) && str.charAt(i) <= 'V') {
				result += 9;
			} else if ('V' < str.charAt(i) && str.charAt(i) <= 'Z') {
				result += 10;
			}
		}
		System.out.println(result);
	}
}
