package B_16_정수론및조합론;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


// 검문(최대공약수)
public class BOJ_2981 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		for(int i = 0; i<N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
		
		int gcd = arr[1]-arr[0];
		for(int i = 2; i<N; i++) {
			gcd = gcd(gcd, arr[i]-arr[i-1]);
		}
		ArrayList<Integer> list = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		
		for(int i = 2; i*i<=gcd; i++) {
			if( i*i == gcd ) {
				list.add(i);
			}else if( gcd%i == 0){
				list.add(i);
				list.add(gcd/i);
			}
		}
		list.add(gcd);
		
		Collections.sort(list);
		for(int i : list) {
			sb.append(i).append(" ");
		}
		System.out.print(sb.toString().trim());
	}
	public static int gcd(int a, int b) {
		int gcd;
		int tmp;
		while( (tmp = a%b) != 0 ) {
			a = b;
			b = tmp;
		}
		gcd = b;
		return gcd;
		
	}
}
