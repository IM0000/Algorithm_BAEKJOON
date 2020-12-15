package B_08_수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1193 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());
		int n = 0;
		//군 찾기
		while (input > (n * (n + 1)) / 2) {
			n++;
		}
		//해당 군에서 몇번째인지 찾기
		int seq = input - (n - 1) * (n) / 2;
		int x, y = 0;
		// y/x
		if ((n + 1) % 2 == 0) {
			y = n;
			x = 1;
			for (int i = 1; i < seq; i++) {
				y--;
				x++;
			}
		} else {
			y = 1;
			x = n;
			for (int i = 1; i < seq; i++) {
				y++;
				x--;
			}
		}
		System.out.printf("%d/%d", y, x);

	}

}
