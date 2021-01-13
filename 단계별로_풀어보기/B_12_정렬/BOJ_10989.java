package B_12_정렬;

import java.io.*;

public class BOJ_10989 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		int[] count = new int[10001];
		for (int i = 0; i < n; i++) {
			count[Integer.parseInt(br.readLine())]++;
		}

		for (int i = 0, k = 0; i < 10001; i++) {
			if (count[i] != 0) {
				int j = 0;
				while (j < count[i]) {
					arr[k] = i;
					k++;
					j++;
				}
			}
			if (k == n)
				break;
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			sb.append(arr[i]).append("\n");
		}
		System.out.print(sb);
		
	}
}
