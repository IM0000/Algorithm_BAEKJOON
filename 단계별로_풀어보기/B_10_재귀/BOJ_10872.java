package B_10_재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10872 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.valueOf(br.readLine());
		System.out.print(getFactorial(n));
	}

	static int getFactorial(int n) {
		if (n == 0) {
			return 1;
		}
		return n * getFactorial(n - 1);
	}
}
