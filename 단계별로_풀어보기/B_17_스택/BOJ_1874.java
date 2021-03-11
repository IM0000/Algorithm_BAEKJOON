package B_17_스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

//스택 수열
public class BOJ_1874 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int value = 0, start = 0;
		Stack<Integer> s = new Stack<Integer>();
		for(int i = 0; i<n; i++) {
			value = Integer.parseInt(br.readLine());
			if(start<value) {
				for(int j = start+1; j<=value; j++) {
					s.add(j);
					sb.append("+\n");
				}
				start = value;
				s.pop();
				sb.append("-\n");
			} else if (start>value) {
				if(s.peek() == value) {
					s.pop();
					sb.append("-\n");
				} else {
					System.out.print("NO");
					return;
				}
			}
		}
		
		System.out.println(sb);
		
	}
}
