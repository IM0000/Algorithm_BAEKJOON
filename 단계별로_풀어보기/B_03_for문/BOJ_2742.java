package B_03_for문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2742 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuffer sb = new StringBuffer();
		for (int i = n; i > 0; i--) {
			sb.append(i);
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}
}
