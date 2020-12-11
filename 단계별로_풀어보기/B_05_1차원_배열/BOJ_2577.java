package B_05_1차원_배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2577 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] a = new int[10];
		int multi = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());
		String s = Integer.toString(multi);
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < a.length; j++) {
				if ((s.charAt(i) - '0') == j) {
					a[j] += 1;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
