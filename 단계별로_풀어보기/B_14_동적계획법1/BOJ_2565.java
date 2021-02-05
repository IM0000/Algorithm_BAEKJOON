package B_14_동적계획법1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class BOJ_2565 {
	static int[] lis;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] A = new int[501];
		int[] arr = new int[N];
		lis = new int[N];
		
		StringTokenizer st;
		int idx, value;
		for(int i = 0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			idx = Integer.parseInt(st.nextToken());
			value = Integer.parseInt(st.nextToken());
			A[idx] = value;
		}
		
		int count=0;
		for(int i = 0; i<501; i++) {
			if(A[i] != 0) {
				arr[count++] = A[i];
			}
		}
		
		lis[0] = arr[0];
		int j = 0;
		int i = 1;
		
		while(i < N) {
			if(lis[j] < arr[i]) {
				lis[j+1] = arr[i];
				j++;
			} else {
				int idx2 = binarySearch(0, j, arr[i]);
				lis[idx2] = arr[i];
			}
			i++;
		}
		
		System.out.println(N-(j+1));
		
	}
	static int binarySearch(int l, int r, int target) {
		int m;
		while(l < r) {
			m = (l+r)/2;
			if(lis[m] < target) {
				l = m+1;
			} else {
				r = m;
			}
		}
		return r;
	}
	
}
