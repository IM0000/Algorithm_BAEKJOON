package B_03_for문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_11021 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuffer sb = new StringBuffer();
		StringTokenizer st;
		int sum;
		for (int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());
			sum = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
			sb.append("Case #" + i + ": " + sum);
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}
}
