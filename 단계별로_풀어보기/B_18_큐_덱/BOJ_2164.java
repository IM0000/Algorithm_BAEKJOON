package B_18_큐_덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

//카드2
public class BOJ_2164 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Queue<Integer> q = new LinkedList<Integer>();
		for(int i=1; i<=N; i++) {
			q.add(i);
		}
		while(q.size() != 1) {
			q.poll();
			q.add(q.poll());
		}
		System.out.println(q.peek());
	}
}
