package B_18_큐_덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;
// 큐2
public class BOJ_18258 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		Deque<Integer> q = new LinkedList<Integer>();
		StringTokenizer st;
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			switch(str) {
			case "push" :
				q.add(Integer.parseInt(st.nextToken()));
				break;
			case "pop" :
				if(!q.isEmpty()) {
					sb.append(q.poll()).append("\n");
				} else {
					sb.append("-1\n");
				}
				break;
			case "size" :
				sb.append(q.size()).append("\n");
				break;
			case "empty" :
				if(!q.isEmpty()) {
					sb.append("0\n");
				} else {
					sb.append("1\n");
				}
				break;
			case "front" :
				if(!q.isEmpty()) {
					sb.append(q.peekFirst()).append("\n");
				} else {
					sb.append("-1\n");
				}
				break;
			case "back" :
				if(!q.isEmpty()) {
					sb.append(q.peekLast()).append("\n");
				} else {
					sb.append("-1\n");
				}
				break;
			}
		}
		System.out.print(sb.toString().trim());
	}
}
