package B_17_스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ_17298 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i =0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Stack<Integer> s = new Stack<Integer>();
		
		for(int i =0; i<N-1; i++) {
			if(arr[i]<arr[i+1]) {
				arr[i] = arr[i+1];
				while(!s.isEmpty()) {
					if( arr[s.peek()] < arr[i+1] ) {
						arr[s.pop()] = arr[i+1];
					} else {
						break;
					}
				}
			} else {
				s.add(i);
			}
		}
		while(!s.isEmpty()) {
			arr[s.pop()] = -1;
		}
		arr[N-1] = -1;
		
		StringBuilder sb = new StringBuilder();
		for(int i =0; i<N; i++) {
			sb.append(arr[i]).append(" ");
		}
		System.out.print(sb.toString().trim());
		
	}
}
