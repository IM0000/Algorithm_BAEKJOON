package B_05_1차원_배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2562 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] a = new int[9];
		int max = 0, index = 0;
		for (int i = 0; i < 9; i++) {
			a[i] = Integer.parseInt(br.readLine());
		}
		for (int i = 0; i < 9; i++) {
			if (a[i] > max) {
				max = a[i];
				index = i + 1;
			}
		}
		System.out.println(max);
		System.out.println(index);
	}
}
