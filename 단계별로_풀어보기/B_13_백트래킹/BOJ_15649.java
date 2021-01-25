package B_13_백트래킹;

import java.io.*;
import java.util.*;
public class BOJ_15649 {
	
	static int[] arr = new int[8];
	static boolean[] isUsed = new boolean[9];
	static int n, m;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		StringBuilder sb = new StringBuilder();
		function(0, sb);
		System.out.print(sb);
	}
	static void function(int k, StringBuilder sb) {
		//base case
		if(k==m) {
			for(int i=0; i<m; i++) {
				sb.append(arr[i]).append(" ");
			}
			sb.append("\n");
			return;
		}
		//recursion
		for(int i =1; i<=n; i++) {
			if(!isUsed[i]) {
				arr[k]=i;
				isUsed[i]=true;
				function(k+1, sb);
				isUsed[i]=false;
			}
		}
	}
}
