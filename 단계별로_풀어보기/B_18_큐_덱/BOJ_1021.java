package B_18_큐_덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

//회전하는 큐
public class BOJ_1021 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		LinkedList<Integer> dq = new LinkedList<>();
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		for(int i=1; i<=N; i++) {
			dq.add(i);
		}
		int[] arr = new int[M];
		st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<M; i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		int count = 0;
		
		for(int i=0; i<M; i++) {
			int target = dq.indexOf(arr[i]);
			int half;
			
			if(dq.size()%2 == 0) {
				half = dq.size()/2 -1;
			} else {
				half = dq.size()/2;
			}
			
			if(target <= half) {
				for(int j=0; j<target; j++) {
					dq.add(dq.poll());
					count++;
				}
			} else {
				for(int j=0; j<dq.size()-target; j++) {
					dq.addFirst(dq.pollLast());
					count++;
				}
			}
			dq.poll();
			
		}
		System.out.println(count);
	}
	
}
