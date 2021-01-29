package B_14_동적계획법1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2579 {
	static int[] score;
	static int[] dp;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		score = new int[N];
		dp = new int[N];
		for(int i=0; i<N; i++) {
			score[i] = Integer.parseInt(br.readLine());
		}
		dp[0] = score[0];

		if(N>1) dp[1] = score[0]+score[1];
		if(N>2) {
			if(score[1]>score[0]) {
				dp[2] = score[1] + score[2];
			} else {
				dp[2] = score[0] + score[2];
			}
		}

		for(int i=3 ; i<N; i++) {
			if(dp[i-3]+score[i-1] > dp[i-2]) {
				dp[i] = dp[i-3]+score[i-1]+score[i];
			} else {
				dp[i] = dp[i-2]+score[i];
			}
		}
		System.out.print(dp[N-1]);
//		System.out.print(func(N-1));

	}
//		static int func(int n) {
//			if(n == 0 || n == 1) return dp[n];
//			if(n == 2) {
//				if(score[n-1] > score[n-2]) {
//					dp[n] = score[n-1] + score[n];
//				} else {
//					dp[n] = score[n-2] + score[n];
//				}
//				return dp[n];
//			}
//			if(dp[n] !=0) return dp[n];
//			dp[n] = Math.max(func(n-3)+score[n-1], func(n-2))+score[n];
//			
//			return dp[n];
//		}
}
