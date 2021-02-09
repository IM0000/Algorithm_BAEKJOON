package B_15_그리디알고리즘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//동전 0
public class BOJ_11047 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int[] A = new int[N];
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			A[N-1-i] = Integer.parseInt(st.nextToken());
		}
		
		int coinNum = 0;
		for(int i = 0; i < N; i++) {
			if(K < A[i]) continue;
			else {
				coinNum = coinNum + K/A[i];
				K = K % A[i];
			}
		}
		System.out.println(coinNum);
	}
}
