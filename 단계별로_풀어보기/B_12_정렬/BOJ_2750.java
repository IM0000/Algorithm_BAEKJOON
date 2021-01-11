package B_12_정렬;

import java.io.*;

public class BOJ_2750 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.valueOf(br.readLine());
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.valueOf(br.readLine());
		}

		int least = 0;
		for (int i = 0; i < n; i++) {
			least = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[least] > arr[j]) {
					least = j;
				}
			}
			if (least != i) {
				swap(arr, i, least);
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			sb.append(arr[i]).append("\n");
		}
		System.out.print(sb.toString().trim());
	}

	static void swap(int[] arr, int a, int b) {
		int tmp = arr[a];
		arr[a] = arr[b];
		arr[b] = tmp;
	}
}
