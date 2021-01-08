package B_11_브루트포스;

import java.util.*;
import java.io.*;

public class BOJ_1018 {

	public static boolean[][] arr;
	public static int min = 64;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		arr = new boolean[N][M];
		// N 행 M 열
		// white 를 true 로
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			for (int j = 0; j < M; j++) {
				if (str.charAt(j) == 'W') {
					arr[i][j] = true;
				}
			}
		}

		int x = N - 7;
		int y = M - 7;

		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				find(i, j);
			}
		}
		
		System.out.print(min);
	}

	static void find(int x, int y) {
		int end_x = x + 8;
		int end_y = y + 8;
		int count = 0;
		boolean std = arr[x][y];

		for (int i = x; i < end_x; i++) {
			for (int j = y; j < end_y; j++) {
				if (arr[i][j] != std) {
					count++;
				}
				std = (!std);
			}
			std = (!std);
		}

		count = Math.min(count, 64 - count);

		if (count < min) {
			min = count;
		}
	}

}
