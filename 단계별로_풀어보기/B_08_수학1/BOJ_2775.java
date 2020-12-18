package B_08_수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2775 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int floor;
		int roomNum;
		StringBuilder sb = new StringBuilder();
		int[][] apt = new int[15][15];
		for (int i = 0; i < 15; i++) {
			apt[i][1] = 1;
		}
		for (int i = 0; i < 15; i++) {
			apt[0][i] = i;
		}
		for (int i = 1; i < 15; i++) {
			for (int j = 1; j < 15; j++) {
				apt[i][j] = apt[i - 1][j] + apt[i][j - 1];
			}
		}
		while (t-- > 0) {
			floor = Integer.parseInt(br.readLine());
			roomNum = Integer.parseInt(br.readLine());
			sb.append(apt[floor][roomNum] + "\n");
		}
		System.out.print(sb);
	}

}
