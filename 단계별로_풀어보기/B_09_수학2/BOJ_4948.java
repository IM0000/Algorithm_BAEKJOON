package B_09_수학2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_4948 {
	public static boolean[] prime = new boolean[246913];
	public static int[] countArr = new int[246913];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n;
		setPrime();
		setCountArr();
		while ((n = Integer.parseInt(br.readLine())) != 0) {
			sb.append(countArr[2 * n] - countArr[n]).append("\n");
		}
		System.out.print(sb.toString().trim());
	}

	public static void setPrime() {
		for (int i = 2; i < prime.length; i++) {
			prime[i] = true;
		}
		for (int i = 2; i <= Math.sqrt(prime.length); i++) {
			for (int j = i + i; j < prime.length; j += i) {
				prime[j] = false;
			}
		}
	}

	public static void setCountArr() {
		int count = 0;
		for (int i = 2; i < prime.length; i++) {
			if (prime[i])
				count++;
			countArr[i] = count;
		}
	}
}
