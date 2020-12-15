package B_08_수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2869 {

	public static void main(String[] args) throws IOException {
		int a, b, v;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		a = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());
		v = Integer.parseInt(st.nextToken());

		int halfDay = 0, distance = 0;
		while (distance < v) {
			if (halfDay % 2 == 0) {
				distance += a;
			} else {
				distance -= b;
			}
			halfDay++;
		}
		System.out.println((int) Math.ceil(halfDay / 2.0));

	}

}
