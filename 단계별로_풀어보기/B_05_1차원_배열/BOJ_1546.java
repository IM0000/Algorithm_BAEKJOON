package B_05_1차원_배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1546 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String str;
		int n = Integer.parseInt(br.readLine());
		double[] a = new double[n];
		str = br.readLine();
		st = new StringTokenizer(str);

		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}

		double max = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}

		for (int i = 0; i < n; i++) {
			a[i] = a[i] / max * 100;
		}

		double sum = 0;
		for (double value : a) {
			sum += value;
		}

		System.out.print(sum / n);
	}
}
