package B_17_스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

//괄호
public class BOJ_9012 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack = new Stack<Integer>();
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		boolean flag = true;
		String[] strArr;
		for(int i =0; i<n; i++) {
			strArr = br.readLine().split("");
			for(String s : strArr) {
				if(s.equals("(")) {
					stack.add(1);
				} else {
					if(!stack.empty()) {
						stack.pop();
					} else {
						flag = false;
						break;
					}
				}
			}
			if(flag) {
				if(stack.size() == 0) {
					sb.append("YES").append("\n");
				} else {
					sb.append("NO").append("\n");
				}
			} else {
				sb.append("NO").append("\n");
			}
			flag = true;
			stack.clear();
		}
		System.out.println(sb);
	}
}
