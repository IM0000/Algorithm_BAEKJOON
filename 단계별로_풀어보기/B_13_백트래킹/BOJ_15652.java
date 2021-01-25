package B_13_백트래킹;

import java.io.*;
import java.util.*;

public class BOJ_15652 {
	static int[] arr = new int[8];
	static StringBuilder sb = new StringBuilder();
	static int n, m;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		backtracking(0,1);		
		System.out.print(sb);
	}
	
	static void backtracking(int index, int start) {
		if(index==m) {
			for(int i = 0; i<m; i++) {
				sb.append(arr[i]).append(" ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i = start; i<=n; i++) {
			
			arr[index] = i;
			backtracking(index+1, i);
		}
	}
}
