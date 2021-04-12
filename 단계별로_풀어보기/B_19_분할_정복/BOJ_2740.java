package B_19_분할_정복;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//행렬 곱셈
public class BOJ_2740 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[][] arr1 = new int[N][M];
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<M; j++) {
				arr1[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		st = new StringTokenizer(br.readLine());
		M = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int[][] arr2 = new int[M][K];
		
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<K; j++) {
				arr2[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int[][] arr3 = new int[N][K];
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<K; j++) {
				int sum = 0;
				for(int k=0; k<M; k++) {
					sum += arr1[i][k]*arr2[k][j];
				}
				arr3[i][j] = sum;
				sb.append(arr3[i][j]).append(" ");
			}
			sb.append("\n");
		}
		
		System.out.print(sb);
			
	}
}
