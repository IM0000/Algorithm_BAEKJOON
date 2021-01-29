package B_14_동적계획법1;

import java.io.*;

public class BOJ_1904 {
	static int[] dp = new int[1000001];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		dp[1]=1;
		dp[2]=2;
		for(int i=3; i<=N; i++) {
			dp[i]=(dp[i-1]+dp[i-2]) % 15746;
		}
		System.out.println(dp[N]);
	}
	
//	public static int fibo(int n) {
//		if(n==1) return 1;
//		if(n==2) return 2;
//		if(dp[n]==0)
//			dp[n] = (fibo(n-1) + fibo(n-2)) % 15746;
//		return dp[n];
//	}
}
