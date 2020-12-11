package B_05_1차원_배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_4344 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int tc = Integer.parseInt(br.readLine());
		for (int t = 0; t < tc; t++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int sum = 0;
			int nums[] = new int[N];
			for (int i = 0; i < N; i++) {
				nums[i] = Integer.parseInt(st.nextToken());
				sum += nums[i];
			}
			int count = 0;
			double mean = (double) sum / N;
			for (int i = 0; i < N; i++) {
				if (nums[i] > mean) {
					count++;
				}
			}
			System.out.printf("%.3f", (double) 100 * count / N);
			System.out.println("%");
		}
	}
}
