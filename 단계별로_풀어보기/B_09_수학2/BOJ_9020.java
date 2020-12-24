package B_09_수학2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_9020 {

	public static boolean[] prime = new boolean[10001];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		int n;
		setPrime();
		while (t-- > 0) {
			n=Integer.parseInt(br.readLine());
			for(int i = n/2; i>1; i--) {
				if(prime[i]&&prime[n-i]) {
					sb.append(i+" "+(n-i)).append("\n");
					break;
				}					
			}
		}
		System.out.print(sb.toString().trim());
	}

	public static void setPrime() {
		for (int i = 2; i < prime.length; i++) {
			prime[i] = true;
		}
		for (int i = 2; i <= Math.sqrt(prime.length); i++) {
			for (int j = i + i; j < prime.length; j += i) {
				prime[j] = false;
			}
		}
	}
}
