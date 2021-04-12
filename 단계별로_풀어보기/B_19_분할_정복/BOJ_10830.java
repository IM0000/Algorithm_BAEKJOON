package B_19_분할_정복;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

//행렬 제곱
public class BOJ_10830 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		long K = Long.parseLong(st.nextToken());
		int[][] arr = new int[N][N];
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<N; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int r = divTwo(K);
		List<int[][]> list = new ArrayList<>();
		list.add(arr);
		for(int i=1; i<=r; i++) {
			arr = cross(N, arr, arr);
			list.add(arr);
		}
		
		int[][] result = new int[N][N];
		result = list.get(r);
		while(r > 0) {
			K = K-(int)Math.pow(2, r);
			r = divTwo(K);
			if(K != 0) {
				result = cross(N, result, list.get(r));
			}
		}
		
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(j==N-1) {
					sb.append(result[i][j]%1000);
					break;
				}
				sb.append(result[i][j]%1000).append(" ");
				
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
		
	}
	public static int divTwo(long n) {
		int cnt = 0;
		while(n/2 > 0) {
			n = n/2;
			cnt++;
		}
		return cnt;
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
