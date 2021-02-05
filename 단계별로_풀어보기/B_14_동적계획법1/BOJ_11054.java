package B_14_동적계획법1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_11054 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N+1];
		int[] dp = new int[N+1];
		int[] dp2 = new int[N+1];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 1; i<N+1; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		dp[1] = 1;
		for(int i = 2; i<N+1; i++) {
			dp[i] = 1;
			for(int j = 1; j<i+1; j++) {
				if(arr[j] < arr[i]) {
					if(dp[j] >= dp[i]) {
						dp[i] = dp[j] + 1;
					}
				}
			}
		}
		
		dp2[N] = 1;
		for(int i = N-1; i>0; i--) {
			dp2[i] = 1;
			for(int j = N; j>i; j--) {
				if(arr[j] < arr[i]) {
					if(dp2[j] >= dp2[i]) {
						dp2[i] = dp2[j] + 1;
					}
				}
			}
		}
		
		int max = 0;
		for(int i = 1; i<N+1; i++) {
			if(dp[i]+dp2[i] > max) {
				max = dp[i] + dp2[i];
			}
		}
		
		System.out.println(max-1);
	}
}
