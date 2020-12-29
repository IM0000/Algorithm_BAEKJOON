package B_10_재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10870 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.valueOf(br.readLine());
		System.out.print(getFibonacci(n));
	}

	static int getFibonacci(int n) {
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;
		return getFibonacci(n - 1) + getFibonacci(n - 2);
	}
}