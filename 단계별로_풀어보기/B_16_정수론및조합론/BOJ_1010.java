package B_16_정수론및조합론;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//다리놓기( 조합 )
public class BOJ_1010 {
	static int[][] C = new int[30][30];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i<T; i++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			sb.append(combination(M, N)).append("\n");
		}
		
		System.out.print(sb.toString().trim());
	
	
	}
	public static int combination(int n, int r) {
		if(C[n][r] != 0) {
			return C[n][r];
		}
		if(n == r || r == 0) {
			C[n][r] = 1;
		} else {
			C[n][r] = combination(n-1 , r) + combination(n-1, r-1);		
		}
		return C[n][r];
	}
}
