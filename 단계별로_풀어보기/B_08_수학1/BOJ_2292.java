package B_08_수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2292 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		if (n == 1) {
			System.out.println(1);
		} else {
			for (int k = 1; k < 32000; k++) {
				int left = (int) (3 * (Math.pow(k - 1, 2)) - 3 * (k - 1) + 1);
				int right = (int) (3 * (Math.pow(k, 2)) - 3 * (k) + 1);
				if (left < n && n <= right) {
					System.out.println(k);
					break;
				}
			}
		}
	}
}
