package B_08_수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2839 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int x = 0;
		int y = 0;
		int result = -1;
		if (n == (int) n) {
			if (n < 5) {
				if (n == 3) {
					y = 1;
				}
			} else {
				switch (n % 5) {
				case 0:
					x = (n / 5);
					break;
				case 1:
					x = (n / 5) - 1;
					y = 2;
					break;
				case 2:
					if (n > 10) {
						x = (n / 5) - 2;
						y = 4;
					}
					break;
				case 3:
					x = (n / 5);
					y = 1;
					break;
				case 4:
					x = (n / 5) - 1;
					y = 3;
					break;
				}
			}
			if (x != 0 || y != 0) {
				result = x + y;
			}
		}
		System.out.println(result);
	}
}
