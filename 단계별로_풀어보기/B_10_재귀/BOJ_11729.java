package B_10_재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_11729 {
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		sb.append((int) Math.pow(2, n) - 1).append("\n");
		hanoi(n, 1, 3, 2);
		System.out.print(sb.toString().trim());
	}

	static void hanoi(int n, int from, int to, int other) {
		if (n == 0) {
			return;
		}
		hanoi(n - 1, from, other, to);
		sb.append(from).append(" ").append(to).append("\n");
		hanoi(n - 1, other, to, from);
	}
}
