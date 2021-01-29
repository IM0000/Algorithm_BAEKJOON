package B_14_동적계획법1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1149 {
	static int[][] cost;
	static int[][] dp;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		cost = new int[N][3];
		dp = new int[N][3];
		StringTokenizer st;
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<3; j++) {
				cost[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		dp[0][0] = cost[0][0];
		dp[0][1] = cost[0][1];
		dp[0][2] = cost[0][2];
		
		int min = Math.min(calMinCost(N-1, 0),Math.min(calMinCost(N-1, 1), calMinCost(N-1, 2)));
		System.out.print(min);
	}
	static int calMinCost(int n, int color) {
		if(dp[n][color] == 0) {
			if(color == 0) {
				dp[n][color] = Math.min(calMinCost(n-1, 1), calMinCost(n-1, 2)) + cost[n][color];
			} else if(color == 1) {
				dp[n][color] = Math.min(calMinCost(n-1, 0), calMinCost(n-1, 2)) + cost[n][color];
			} else {
				dp[n][color] = Math.min(calMinCost(n-1, 0), calMinCost(n-1, 1)) + cost[n][color];
			}
		}
		return dp[n][color];
	}
	
	
// 완전탐색, 백트래킹 코드
//	static int[][] cost;
//	static int min = 1000000;
//	static int N;
//	static int result = 0;
//	static int color = -1;
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		N = Integer.parseInt(br.readLine());
//		cost = new int[N][3];
//		StringTokenizer st;
//		for(int i=0; i<N; i++) {
//			st = new StringTokenizer(br.readLine());
//			for(int j=0; j<3; j++) {
//				cost[i][j] = Integer.parseInt(st.nextToken());
//			}
//		}
//		func(0);
//		
//		System.out.print(min);
//	}
//	
//	public static void func(int n) {
//		
//		if(n == N) {
//			if(result < min) {
//				min = result;
//			}
//			return;
//		}
//		
//		for(int i=0; i<3; i++) {
//			if(color==i) continue;
//			if(result > min) continue;
//			int tmp = result;
//			int tmp2 = color;
//			color = i;
//			result += cost[n][i];
//			func(n+1);
//			result = tmp;
//			color = tmp2;
//		}
//	}
}
