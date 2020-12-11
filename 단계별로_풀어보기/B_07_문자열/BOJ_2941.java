package B_07_문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2941 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int count = str.length();
		int result = count;
		for (int i = 0; i < count; i++) {
			if (str.charAt(i) == '-' || str.charAt(i) == '=') {
				result -= 1;
			} else if (str.charAt(i) == 'z') {
				if (0 < i && i < count - 1) {
					if (str.charAt(i - 1) == 'd' && str.charAt(i + 1) == '=') {
						result -= 1;
					}
				}
			} else if (str.charAt(i) == 'j') {
				if (i > 0) {
					if (str.charAt(i - 1) == 'l' || str.charAt(i - 1) == 'n') {
						result -= 1;
					}
				}
			}
		}
		System.out.println(result);
	}
}
