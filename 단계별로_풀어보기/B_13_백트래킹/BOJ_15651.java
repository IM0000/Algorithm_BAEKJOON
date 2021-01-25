package B_13_백트래킹;

import java.io.*;
import java.util.*;

public class BOJ_15651 {
	static int m, n;
	static int[] arr = new int[7];
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		backtracking(0);
		System.out.print(sb);
		
	}
	static void backtracking(int index) {
		if(index == m) {
			for(int i=0; i<m; i++) {
				sb.append(arr[i]).append(" ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i = 1; i<=n; i++) {
			arr[index] = i;
			backtracking(index+1);
		}
	}
}
