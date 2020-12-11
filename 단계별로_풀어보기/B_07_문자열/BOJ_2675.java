package B_07_문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2675 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		while (T-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			String str2 = st.nextToken();
			
			for (int i = 0; i < str2.length(); i++) {
				for (int j = 0; j < n; j++) {
					sb.append(String.valueOf(str2.charAt(i)));
				}
			}
			
			sb.append("\n");
			
		}
		
		System.out.print(sb);
	}
}
