package B_19_분할_정복;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

//행렬 제곱
public class BOJ_10831_2 {
	static int[][] unitMatrix;
	static int N; 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		long K = Long.parseLong(st.nextToken());
		int[][] arr = new int[N][N];
		unitMatrix = new int[N][N];
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<N; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		for (int i = 0; i < N; i++)
            unitMatrix[i][i] = 1;
		
		arr = powArr(K, arr);
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(j==N-1) {
					sb.append(arr[i][j]%1000);
					break;
				}
				sb.append(arr[i][j]%1000).append(" ");
				
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
		
	}
	public static int[][] powArr(long n,  int[][] arr){
		if(n==0) return unitMatrix;
		if(n==1) return arr;
		int[][] narr = powArr(n/2, arr);
		narr = cross(N, narr, narr);
		return n % 2 == 0 ? narr : cross(N, narr, arr);
	}
	public static int[][] cross(int n, int[][] arr1, int[][] arr2) {
		int[][] arr3 = new int[n][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				int sum = 0;
				for(int k=0; k<n; k++) {
					sum += (arr1[i][k]*arr2[k][j])%1000;
				}
				arr3[i][j] = sum%1000;
			}
		}
		return arr3;
	}
}
