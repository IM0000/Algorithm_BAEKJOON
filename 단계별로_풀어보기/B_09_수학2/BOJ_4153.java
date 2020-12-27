package B_09_수학2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_4153 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int a, b, c;
		String str = br.readLine();
		StringBuilder sb = new StringBuilder();
		while (!str.equals("0 0 0")) {
			st = new StringTokenizer(str);
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			c = Integer.parseInt(st.nextToken());
			if (Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2) || Math.pow(b, 2) == Math.pow(c, 2) + Math.pow(a, 2)
					|| Math.pow(c, 2) == Math.pow(a, 2) + Math.pow(b, 2)) {
				sb.append("right").append("\n");
			} else {
				sb.append("wrong").append("\n");
			}
			str = br.readLine();
		}
		System.out.print(sb);
	}

}
