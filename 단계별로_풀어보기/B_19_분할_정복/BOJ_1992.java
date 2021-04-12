package B_19_분할_정복;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//쿼드트리
public class BOJ_1992 {
	static int[][] arr;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		arr = new int[N][N];
		String str;
		
		for(int i =0; i<N; i++) {
			str = br.readLine();
			for(int j =0; j<N; j++) {
				arr[i][j] = str.charAt(j) - '0';
			}
		}
		func(0,0,N);
		
		System.out.println(sb);
		
	}
	static void func(int row, int col, int n) {
		boolean chk = false;
		if(n==1) {
			if(arr[row][col] == 1) {
				sb.append(1);
			} else {
				sb.append(0);
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
			sb.append("(");
			func(row,col,n/2);
			func(row,col+n/2,n/2);
			func(row+n/2,col,n/2);
			func(row+n/2,col+n/2,n/2);
			sb.append(")");			
		} else {
			if(arr[row][col] == 1) {
				sb.append(1);
			} else {
				sb.append(0);
			}
		}
		
	}
	
}
