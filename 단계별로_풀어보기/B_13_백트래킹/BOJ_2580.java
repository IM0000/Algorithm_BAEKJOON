package B_13_백트래킹;

import java.io.*;
import java.util.*;
public class BOJ_2580 {
	static int[][] sudoku = new int[9][9];
	static int[] rows = new int[81];
	static int[] cols = new int[81];
	static int count = 0; //0의 갯수
	static boolean flag; // 스도쿠가 하나 완성되면 ture

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st; 
		//스도쿠 입력 및 0인 행, 열 저장
		for(int i=0;i<9;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<9;j++) {
				int n = Integer.parseInt(st.nextToken());
				if(n==0) {
					rows[count]=i;
					cols[count]=j;
					count++;
				}
				sudoku[i][j] = n;
			}
		}

		func(0);

		//출력
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				if(j!=8)
					sb.append(sudoku[i][j]).append(" ");
				if(j==8)
					sb.append(sudoku[i][j]);
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}

	public static void func(int cnt) {
		if(cnt==count) {
			flag = true;
			return;
		}
		boolean[] check = new boolean[10];

//		쓸 수 없는 값을 true로 바꿈
		for(int j=0; j<sudoku.length; j++) {
			check[sudoku[rows[cnt]][j]]=true;
		}
		for(int j=0; j<sudoku.length; j++) {
			check[sudoku[j][cols[cnt]]]=true;
		}
		int n=rows[cnt]/3*3;
		int m=cols[cnt]/3*3;
		for(int j=n; j<n+3; j++) {
			for(int k=m; k<m+3; k++) {
				check[sudoku[j][k]]=true;
			}
		}
		
		for(int i=1; i<10; i++) {
			if(flag) {
				return;
			}			
			if(!check[i]) {
				sudoku[rows[cnt]][cols[cnt]]=i;
				func(cnt+1);
				if(!flag) {
					sudoku[rows[cnt]][cols[cnt]]=0;
				}
			}
		}
	}
}
