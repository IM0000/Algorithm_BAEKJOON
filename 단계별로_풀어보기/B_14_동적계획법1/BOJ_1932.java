package B_14_동적계획법1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class BOJ_1932 {
	static int[][] arr;
	static int[][] dp;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		arr = new int[n][];
		dp = new int[n][];
		for(int i=0; i<n; i++) {
			arr[i] = new int[i+1];
			dp[i] = new int[i+1];
		}

		StringTokenizer st;
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				dp[i][j] = -1;
			}
		}
		dp[0][0] = arr[0][0];
		
		
		int max = -1;
		for(int i = 0; i<n; i++) {
			if(max < func(n-1, i)) {
				max = func(n-1, i);
			}
		}
		System.out.println(max);
	}
	
	static int func(int n, int col) {
		if(dp[n][col] == -1) {
			if(col!=0 && col!=n) {
				dp[n][col] = Math.max(func(n-1, col), func(n-1, col-1)) + arr[n][col];
			} else if (col == 0) {
				dp[n][col] = func(n-1, col) + arr[n][col];
			} else {
				dp[n][col] = func(n-1, col-1) + arr[n][col];
			}
		}
		return dp[n][col];
	}
}
