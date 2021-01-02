package B_11_브루트포스;

import java.io.*;

public class BOJ_2231 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(br.readLine());
		System.out.print(getGen(N));
	}

	static int getGen(int n) {
		String str = String.valueOf(n);
		int gen = 0;
		for (int i = n - 1; i >= n-(str.length()*9); --i) {
			if (getDecom(i) == n) {
				gen = i;
			}
		}
		return gen;
	}

	static int getDecom(int n) {
		int decom = n;
		while (n > 0) {
			decom += n % 10;
			n = n / 10;
		}
		return decom;
	}
}
