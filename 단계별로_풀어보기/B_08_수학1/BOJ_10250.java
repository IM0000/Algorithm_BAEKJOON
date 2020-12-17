package B_08_수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10250 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int h, n;
		while (t-- > 0) {
			st = new StringTokenizer(br.readLine());
			h = Integer.parseInt(st.nextToken());
			st.nextToken();
			n = Integer.parseInt(st.nextToken());
			if (n % h == 0) {
				sb.append(h);
				if (n / h < 10) {
					sb.append(0);
				}
				sb.append(n / h);
			} else {
				sb.append(n % h);
				if (n / h + 1 < 10) {
					sb.append(0);
				}
				sb.append(n / h + 1);
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
