package B_03_for문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10871 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		StringBuilder sb = new StringBuilder();
		st = new StringTokenizer(br.readLine());
		int temp;
		for(int i=0; i<n; i++) {
			temp = Integer.parseInt(st.nextToken());
			if(temp<x) {
				sb.append(temp).append(" ");
			}
		}
		System.out.print(sb.toString().trim());
	}
}
