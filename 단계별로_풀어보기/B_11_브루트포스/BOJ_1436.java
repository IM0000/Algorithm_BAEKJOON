package B_11_브루트포스;

import java.io.*;

public class BOJ_1436 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.valueOf(br.readLine());
		System.out.println(getTitle(n));
	}

	static int getTitle(int n) {
		int order = 0;
		int target = 0;
		int result = 0;

		for (int i = 666; order < n; i++) {
			target = i;
			while (target > 100) {
				if (target % 1000 == 666) {
					order++;
					result = i;
					break;
				}
				target = target / 10;
			}
		}
		return result;
	}
}
