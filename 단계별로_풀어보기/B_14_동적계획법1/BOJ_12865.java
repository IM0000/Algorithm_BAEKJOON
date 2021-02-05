package B_14_동적계획법1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_12865 {
	static int[] W = new int[100];
	static int[] V = new int[100];
	static int N, K;
	static int[][] dp = new int[101][100001];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			W[i] = Integer.parseInt(st.nextToken());
			V[i] = Integer.parseInt(st.nextToken());
		}
		System.out.println(go(0,0));
		
		
	}
	public static int go(int i, int w) {
		if(dp[i][w] !=0) return dp[i][w];
		if(i == N) return 0;
		
		
		int n1 = 0;
		if(w + W[i] <= K)
			n1 = V[i] + go(i+1, w + W[i]); //포함
		int n2 = go(i+1, w); //미포함
		return dp[i][w] = Math.max(n1, n2);
	}
}
