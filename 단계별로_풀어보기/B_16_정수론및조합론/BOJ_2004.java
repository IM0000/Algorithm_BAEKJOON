package B_16_정수론및조합론;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//조합 0의 개수
public class BOJ_2004 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int dif = n - m;
		int two = getNumoftwo(n) - getNumoftwo(m) - getNumoftwo(dif);
		int five = getNumoffive(n) - getNumoffive(m) - getNumoffive(dif);
		
		System.out.print(Math.min(two, five));
		
	}
	public static int getNumoftwo(int n) {
		int cnt = 0;
		int tmp = n;
		int i = 1;
		while(tmp!=0) {
			tmp = n / (int)Math.pow(2, i);
			cnt = cnt + tmp;
			i++;
		}
		return cnt;
	}
	public static int getNumoffive(int n) {
		int cnt = 0;
		int tmp = n;
		int i = 1;
		while(tmp!=0) {
			tmp = n / (int)Math.pow(5, i);
			cnt = cnt + tmp;
			i++;
		}
		return cnt;
	}
	
}
