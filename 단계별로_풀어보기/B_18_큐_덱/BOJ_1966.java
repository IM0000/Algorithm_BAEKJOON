package B_18_큐_덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;


//프린터 큐
public class BOJ_1966 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		while(T-- > 0) {
			int N, M;
			st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			
			st = new StringTokenizer(br.readLine());
			LinkedList<int[]> list = new LinkedList<>();

			for(int i = 0; i<N; i++) {
				list.add(new int[] {i, Integer.parseInt(st.nextToken())});
			}
			
			int count = 0;
			
			while(!list.isEmpty()) {
				int[] front = list.poll();
				boolean chk = false;
				
				for(int i=0; i<list.size(); i++) {
					if(front[1] < list.get(i)[1]) {
						list.add(front);
						for(int j=0; j<i; j++) {
							list.add(list.poll());
						}
						chk = true;
						break;
					}
				}
				if(chk) {
					continue;
				}
				count++;
				if(front[0] == M) {
					break;
				}						
			}
			sb.append(count).append("\n");
		}
		System.out.print(sb.toString().trim());
	}
}
