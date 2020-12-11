package B_03_for문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2739 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int n = Integer.parseInt(str);
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", n, i, n * i);
		}
	}
}
