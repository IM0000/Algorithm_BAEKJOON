package B_02_if문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2884 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int h = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);
		int t = h * 60 + m;
		if (t < 45)
			t += 1440;
		t -= 45;
		h = t / 60;
		m = t % 60;
		System.out.printf("%d %d", h, m);
	}
}
