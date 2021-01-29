package B_14_동적계획법1;

import java.io.*;

public class BOJ_9461 {
	static long[] dp = new long[101];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		dp[1] = 1;
		dp[2] = 1;
		dp[3] = 1;
		dp[4] = 2;
		dp[5] = 2;
		dp[6] = 3;
		dp[7] = 4;
		dp[8] = 5;
		for(int i=9; i<=100; i++) {
			dp[i] = dp[i-1]+dp[i-5];
		}
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<T; i++) {
			int N = Integer.parseInt(br.readLine());
			sb.append(dp[N]).append("\n");
		}
		System.out.println(sb);
		
	}
}
