package B_13_백트래킹;

import java.util.*;
import java.io.*;

public class BOJ_14889 {
	static boolean[] isUsed = new boolean[20];
	static int min = 9001;
	static int N;
	static int[][] board;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		board = new int[N][N];
		StringTokenizer st;

		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<N; j++) {
				board[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		dfs(0, 0);
		System.out.println(min);
	}
	public static void dfs(int n, int step) {
		if(step == N/2) {
			int res1=0, res2=0;
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					if(isUsed[i] && isUsed[j]) {
						res1 += board[i][j];
					}
					if(!isUsed[i] && !isUsed[j]) {
						res2 += board[i][j];
					}
				}
			}
			int dif = Math.abs(res1-res2);
			if(min>dif) {
				min = dif;
			}
			if(dif == 0) {
				System.out.println(0);
				System.exit(0);
			}
			return;
		}

		for(int i=n; i<N; i++) {
			if(!isUsed[i]) {
				isUsed[i] = true;
				dfs(i+1, step+1);
				isUsed[i] = false;
			}
		}

	}
}
