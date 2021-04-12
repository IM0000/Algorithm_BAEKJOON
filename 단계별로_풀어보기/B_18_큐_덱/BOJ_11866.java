package B_18_큐_덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_11866 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		Queue<Integer> q = new LinkedList<Integer>();
		int[] arr = new int[N];
		
		for(int i=1; i<=N; i++) {
			q.add(i);
		}
		int i = 1;
		int j = 0;
		while(j != N) {
			
			
			if(i != K) {
				q.add(q.poll());
			} else {
				arr[j] = q.poll();
				i=0;
				j++;
			}
			i++;
			
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		for(int k =0 ; k<N-1; k++) {
			
			sb.append(arr[k]).append(", ");
			
		}
		sb.append(arr[N-1]).append(">");
		System.out.print(sb.toString().trim());
	}
}
