package B_05_1차원_배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_3052 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] a = new int[10];
		int count = 0;

		for (int i = 0; i < 10; i++) {
			a[i] = Integer.parseInt(br.readLine()) % 42;
		}

		for (int i = 0; i < 42; i++) {
			for (int j = 0; j < 10; j++) {
				if (a[j] == i) {
					count++;
					break;
				}
			}
		}
		System.out.print(count);
	}
}
