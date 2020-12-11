package B_05_1차원_배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10818 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int nmax, nmin;
		int n = Integer.parseInt(br.readLine());
		int[] a = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		nmax = a[0];
		nmin = a[0];
		for (int i = 0; i < n; i++) {
			if (a[i] > nmax)
				nmax = a[i];
			else if (a[i] < nmin)
				nmin = a[i];
		}
		System.out.printf("%d %d", nmin, nmax);
	}
}
