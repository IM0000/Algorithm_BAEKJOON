package B_14_동적계획법1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_9184 {
	static int[][][] w = new int[21][21][21];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		while(!"-1 -1 -1".equals(str)) {
			st = new StringTokenizer(str);
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			sb.append("w(").append(a).append(", ")
			.append(b).append(", ")
			.append(c).append(") = ")
			.append(w(a, b, c)).append("\n");
			str = br.readLine();
		}
		System.out.print(sb);
	}
	public static int w(int a, int b, int c) {
		
		if(a<=0 || b<=0 || c<=0) {
			return 1;
		}
		if (a>20 || b>20 || c>20) {
			return w(20, 20, 20);
		}
		if(w[a][b][c]!=0) {
			return w[a][b][c];
		}
		
		if(a<b && b<c) {
			w[a][b][c] = w(a, b, c-1)+w(a, b-1, c-1)-w(a, b-1, c);
		} else {
			w[a][b][c] = w(a-1, b, c) + w(a-1, b-1, c) + w(a-1, b, c-1) - w(a-1, b-1, c-1);
		}
		return w[a][b][c];
	}
}
