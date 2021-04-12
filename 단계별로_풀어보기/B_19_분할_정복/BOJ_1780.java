package B_19_분할_정복;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//종이의 개수
public class BOJ_1780 {
	static int minusCnt = 0;
	static int zeroCnt = 0;
	static int plusCnt = 0;
	static int[][] arr;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		arr = new int[N][N];
		StringTokenizer st;
		for(int i =0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j =0; j<N; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		dc(0,0,N);
		System.out.printf("%d\n%d\n%d", minusCnt, zeroCnt, plusCnt);

	}
	
	public static void dc(int row, int col, int n) {
		if(n == 1) {
			if(arr[row][col] == -1) {
				minusCnt++;
			} else if(arr[row][col] == 0) {
				zeroCnt++;
			} else {
				plusCnt++;
			}
			return;
		}
		boolean chk = false;
		for(int i=row; i<n+row; i++) {
			for(int j=col; j<n+col; j++) {
				if(arr[row][col] != arr[i][j]) {
					chk = true;
					break;
				}
			}
			if(chk) break;
		}
		if(chk) {
			dc(row, col, n/3);
			dc(row+n/3, col, n/3);
			dc(row+2*n/3, col, n/3);
			dc(row, col+n/3, n/3);
			dc(row, col+2*n/3, n/3);
			dc(row+n/3, col+n/3, n/3);
			dc(row+2*n/3, col+n/3, n/3);
			dc(row+n/3, col+2*n/3, n/3);
			dc(row+2*n/3, col+2*n/3, n/3);
		} else {
			if(arr[row][col] == -1) {
				minusCnt++;
			} else if(arr[row][col] == 0) {
				zeroCnt++;
			} else {
				plusCnt++;
			}
		}
		
		
	}
}
