package B_14_동적계획법1;

import java.io.*;
import java.util.*;

public class BOJ_2156 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int arr[] = new int[N+1];
		int dp[] = new int[N+1];
		
		for(int i = 1; i<=N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		dp[1] = arr[1];
		if(N>1) dp[2] = arr[1] + arr[2];
		if(N>2) {
			dp[3] = Math.max(arr[1], arr[2]) + arr[3];
			dp[3] = Math.max(dp[3], dp[2]);
		}
		
		for(int i = 4; i<=N; i++) {
			dp[i] = Math.max(dp[i-2], dp[i-3]+arr[i-1]) + arr[i];
			dp[i] = Math.max(dp[i], dp[i-1]);
		}
	
		System.out.println(dp[N]);
	}
}
