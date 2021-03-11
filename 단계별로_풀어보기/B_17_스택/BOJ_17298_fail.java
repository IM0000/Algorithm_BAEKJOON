package B_17_스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;


//오큰수(오른쪽에 있으면서 크고 가장 왼쪽에 있는 수)
public class BOJ_17298_fail {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		Stack<Integer> s1 = new Stack<Integer>();
		Stack<Integer> s2 = new Stack<Integer>();
		
		for(int i = 0; i<N; i++) {
			s1.add(Integer.parseInt(st.nextToken()));
		}
		s2.add(-1);
		
		int pop;
		
		for(int i = 0; i<N-1; i++) {
			pop = s1.pop();
			if(s1.peek() < pop) {
				s2.add(pop);
			} else {
				if(s1.peek() < s2.peek()) {
					s2.add(s2.peek());
				} else {
					s2.add(-1);
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		while(!s2.empty()) {
			sb.append(s2.pop()).append(" ");
		}
		System.out.print(sb.toString().trim());
	}
}
