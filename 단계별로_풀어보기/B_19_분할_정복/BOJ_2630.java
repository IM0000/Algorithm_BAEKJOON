package B_19_분할_정복;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//색종이 만들기
public class BOJ_2630 {
	static int bluecnt = 0;
	static int whitecnt = 0;
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
		func(0,0,N);
		System.out.printf("%d\n%d", whitecnt, bluecnt);
		
	}
	static void func(int row, int col, int n) {
		boolean chk = false;
		if(n==1) {
			if(arr[row][col] == 1) {
				bluecnt++;
			} else {
				whitecnt++;
			}
			return;
		}
		
		for(int i =row; i<row+n; i++) {
			for(int j =col; j<col+n; j++) {
				if( arr[row][col] != arr[i][j] ) {
					chk = true;
					break;
				}
			}
			if(chk) break;
		}
		
		if(chk) {
			func(row,col,n/2);
			func(row+n/2,col,n/2);
			func(row,col+n/2,n/2);
			func(row+n/2,col+n/2,n/2);
		} else {
			if(arr[row][col] == 1) {
				bluecnt++;
			} else {
				whitecnt++;
			}
		}
		
	}
	
}
