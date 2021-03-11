package B_17_스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

//스택
public class BOJ_10828 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<Integer>();
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		for(int i =0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			if(st.countTokens() == 2) {
				st.nextToken();
				stack.add(Integer.parseInt(st.nextToken()));
			} else {
				switch(st.nextToken()) {
					case "pop" :
						if(stack.isEmpty()) {
							sb.append("-1").append("\n");
						} else {
							sb.append(stack.pop()).append("\n");
						}
						break;
					case "size" :
						sb.append(stack.size()).append("\n");
						break;
					case "empty" :
						if(stack.isEmpty()) {
							sb.append("1").append("\n");
						} else {
							sb.append("0").append("\n");
						}
						break;
					case "top" :
						if(stack.isEmpty()) {
							sb.append("-1").append("\n");
						} else {
							sb.append(stack.peek()).append("\n");
						}
						break;
				}
			}
		}
		System.out.print(sb);
		
	}
}
