package B_15_그리디알고리즘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//주유소(최소 기름 비용)
public class BOJ_13305 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] dist = new int[N-1];
		int[] cost = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N-1; i++) {
			dist[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			cost[i] = Integer.parseInt(st.nextToken());
		}
		
		long minCost = 0;
		long distSum = 0;
		
		for(int i = 0; i < N-1; ) {
			for(int j = i+1; j < N; j++) {
				distSum += dist[j-1];
				if(cost[i] <= cost[j]) {
					if(j == N-1) {
						minCost += distSum*cost[i];
						i = j;
					}
					 continue;
				} else {
					minCost += distSum*cost[i];
					distSum = 0;
					i = j;
					break;
				}
			}
		}
		System.out.println(minCost);
		
	}
}
