package B_11_브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2798 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n, m, min, sum, result = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.valueOf(st.nextToken());
		m = Integer.valueOf(st.nextToken());
		int[] card = new int[n];
		min = m;
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			card[i] = Integer.valueOf(st.nextToken());
		}
		out: for (int i = 0; i < n - 2; i++) {
			if (card[i] > m)
				continue;
			
			for (int j = i + 1; j < n - 1; j++) {
				if (card[i] + card[j] > m)
					continue;
				
				for (int k = j + 1; k < n; k++) {

					sum = card[i] + card[j] + card[k];
					if (sum == m) {
						result = sum;
						break out;
					} else if (sum > m) {
						continue;
					} else if ((m - sum) < min) {
						min = (m - sum);
						result = sum;
					}

				}
			}
		}
		System.out.print(result);
	}
}