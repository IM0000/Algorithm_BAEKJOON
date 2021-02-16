package B_16_정수론및조합론;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//이항 계수 (조합)
public class BOJ_11051 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int[][] memo = new int[N+1][N+1];
		
		for(int i = 0; i<N+1; i++) {
			
			for(int j = 0; j<=Math.min(i, K); j++) {
				if(i==j || j==0) {
					memo[i][j] = 1;
				} else {
					memo[i][j] = (memo[i-1][j]%10007 + memo[i-1][j-1]%10007) % 10007;
				}
			}
		}
		
		System.out.print(memo[N][K]);
	}
}
