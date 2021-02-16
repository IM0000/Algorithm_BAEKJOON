package B_16_정수론및조합론;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


//링(기어비)
public class BOJ_3036 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		for(int i =0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int[] gcd = new int[N-1];
		for(int i=0; i<N-1; i++) {
			gcd[i] = gcd(arr[0], arr[i+1]);
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i<N-1; i++) {
			sb.append(arr[0]/gcd[i]).append("/").append(arr[i+1]/gcd[i]).append("\n");
		}
		System.out.println(sb.toString().trim());
	}
	public static int gcd(int a, int b) {
		int tmp;
		while( (tmp = a%b) != 0 ) {
			a=b;
			b=tmp;
		}
		return b;
	}
}
