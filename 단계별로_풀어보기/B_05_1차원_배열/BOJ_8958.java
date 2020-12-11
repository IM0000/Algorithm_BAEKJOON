package B_05_1차원_배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_8958 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = "";
		int sum = 0, count = 0;
		int N = Integer.parseInt(br.readLine());
		StringBuilder result = new StringBuilder();

		while (N-- > 0) {
			str = br.readLine();
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == 'O')
					sum += ++count;
				else
					count = 0;
			}
			result.append(sum + "\n");
			sum = 0;
			count = 0;
		}

		System.out.print(result);
	}
}
