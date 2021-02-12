package B_16_정수론및조합론;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//최소공배수
public class BOJ_1934 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i<T; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int mul = a*b;
			int tmp;
			while( (tmp = a%b) != 0) {
				a = b;
				b = tmp;
			}
			sb.append(mul/b).append("\n");
		}
		System.out.println(sb);
	}
}
