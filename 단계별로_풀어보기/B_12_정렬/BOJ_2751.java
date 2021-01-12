package B_12_정렬;

import java.io.*;

public class BOJ_2751 {
	static int[] tmp = new int[1_000_000];
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.valueOf(br.readLine());
		int[] array = new int[n];
		for(int i = 0; i<n; i++) {
			array[i] = Integer.valueOf(br.readLine());
		}
		mergesort(array, 0, n-1);
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<n; i++) {
			sb.append(array[i]).append("\n");
		}
		System.out.println(sb);
	}

	static void mergesort(int[] arr, int l, int r) {
		if (l < r) {
			int m = l + (r - l) / 2;

			mergesort(arr, l, m);
			mergesort(arr, m + 1, r);

			merge(arr, l, m, r);
		}
	}

	static void merge(int[] arr, int l, int m, int r) {
//		int[] tmp = new int[1_000_000];
//		int[] tmp = new int[r-l+1];
		int i = l;
		int j = m+1;
		int k = 0;
		//한쪽이 전멸할때까지
		while(i<=m && j<=r) {
			if(arr[i]<=arr[j]) {
				tmp[k]=arr[i];
				i++;
				k++;
			} else {
				tmp[k]=arr[j];
				j++;
				k++;
			}
		}
		//왼쪽이 전멸
		while(j<=r) {
			tmp[k]=arr[j];
			j++;
			k++;
		}
		//오른쪽이 전멸
		while(i<=m) {
			tmp[k]=arr[i];
			i++;
			k++;
		}
		k--;
		//문서작성
		while(k>=0) {
			arr[l+k]=tmp[k];
			k--;
		}
	}
}
