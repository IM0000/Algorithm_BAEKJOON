package B_17_스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

//제로
public class BOJ_10773 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int K = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<Integer>();
		for(int i=0; i<K; i++) {
			int N = Integer.parseInt(br.readLine());
			if(N == 0) {
				stack.pop();
			} else {
				stack.add(N);
			}
		}
		int sum = 0;
		while(!stack.empty()) {
			sum += stack.pop();
		}
		System.out.println(sum);
		
	}
}
