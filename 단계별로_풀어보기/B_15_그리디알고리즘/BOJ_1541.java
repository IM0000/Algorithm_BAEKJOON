package B_15_그리디알고리즘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//잃어버린 괄호
public class BOJ_1541 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), "-");
		int sum = 0;
		if(st.countTokens() == 1) {
			StringTokenizer st2 = new StringTokenizer(st.nextToken(), "+");
			while(st2.hasMoreTokens()) {
				sum = sum + Integer.parseInt(st2.nextToken());
			}
		} else {
			StringTokenizer st3 = new StringTokenizer(st.nextToken(), "+");
			while(st3.hasMoreTokens()) {
				sum = sum + Integer.parseInt(st3.nextToken());
			}
			while(st.hasMoreTokens()) {
				StringTokenizer st4 = new StringTokenizer(st.nextToken(), "+");
				while(st4.hasMoreTokens()) {
					sum = sum - Integer.parseInt(st4.nextToken());
				}
			}
			
		}
		System.out.print(sum);
	}
}
