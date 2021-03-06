package B_08_수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1712 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a, b, c;
		StringTokenizer st = new StringTokenizer(br.readLine());
		a = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		System.out.println(BOJ_1712.getBEpoint(a, b, c));
	}

	public static int getBEpoint(int a, int b, int c) {
		int result = -1;
		if (c > b) {
			result = a / (c - b) + 1;
		}
		return result;
	}
}
