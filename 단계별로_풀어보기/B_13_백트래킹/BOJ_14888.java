package B_13_백트래킹;

import java.util.*;
import java.io.*;

public class BOJ_14888 {
	static int N;
	static int[] num = new int[11];
	static int[] cal = new int[4];
	static int max=-1000000001;
	static int min=1000000001;
	static int result;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i<N; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i<4; i++) {
			cal[i] = Integer.parseInt(st.nextToken());
		}
		dfs(0);
		System.out.printf("%d\n%d",max,min);
	}
	private static void dfs(int i) {
		if(i == N-1) {
			if(max < result) 
				max = result;
			if(min > result) 
				min = result;
			return;
		}

		if(i == 0) {
			result = num[i];
		}
		for(int j = 0; j<4; j++) {
			if(cal[j]>0) {
				int tmp = result;
				if(j==0) {
					result += num[i+1];
				} else if (j==1) {
					result -= num[i+1];
				} else if (j==2) {
					result *= num[i+1];
				} else {
					result /= num[i+1];
				}
				cal[j]--;
				dfs(i+1);
				cal[j]++;
				result = tmp;
			}
		}
	}
}
