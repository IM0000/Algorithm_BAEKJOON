package B_06_함수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1065 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (i < 100) {
				count++;
			} else {
				String str = String.valueOf(i);
				if (str.charAt(0) - str.charAt(1) == str.charAt(1) - str.charAt(2)) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
