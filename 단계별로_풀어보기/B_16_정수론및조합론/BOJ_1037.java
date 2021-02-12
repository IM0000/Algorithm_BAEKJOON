package B_16_정수론및조합론;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//약수 (진짜약수)
public class BOJ_1037 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int[] arr = new int[T];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<T; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		System.out.println(arr[0]*arr[T-1]);
		
	}
}
