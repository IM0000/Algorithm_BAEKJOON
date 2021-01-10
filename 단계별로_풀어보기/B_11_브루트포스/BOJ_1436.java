package B_11_브루트포스;

import java.io.*;

public class BOJ_1436 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.valueOf(br.readLine());
		int number = 665;
		String str = "";

		while (true) {
			number++;
			str = String.valueOf(number);
			for (int i = 0; i < str.length() - 2; i++) {
				if (str.charAt(i) == '6' && str.charAt(i + 1) == '6' && str.charAt(i + 2) == '6') {
					n--;
					break;
				}
			}
			if (n == 0) {
				break;
			}
		}
		System.out.println(str);
	}
}
