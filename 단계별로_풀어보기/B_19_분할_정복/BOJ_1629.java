package B_19_분할_정복;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//곱셈
public class BOJ_1629 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long A = Integer.parseInt(st.nextToken());
		long B = Integer.parseInt(st.nextToken());
		long C = Integer.parseInt(st.nextToken());
		
		long res = func(A,B,C);
		
		
		
		System.out.println(res);
		
		
	}
	public static long func(long a, long b, long c) {
		if(b==1) {
			return a%c;
		} else {
			long tmp = func(a,b/2,c);
			if(b%2 == 0) {
				return (tmp*tmp)%c;
			} else {
				return (((tmp*tmp)%c)*(a%c))%c;
			}
		}
	}
}
