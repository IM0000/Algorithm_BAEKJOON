package B_09_수학2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class BOJ_1929 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int m,n;
		StringTokenizer st = new StringTokenizer(br.readLine());
		m=Integer.parseInt(st.nextToken());
		n=Integer.parseInt(st.nextToken());
		StringBuilder sb = new StringBuilder();
		boolean[] check = isPrimeNumber(n);
		for(int i =m; i<=n; i++) {
			if(check[i]) {
				sb.append(i).append("\n");
			}
		}
		System.out.print(sb.toString().trim());
	}
	
	public static boolean[] isPrimeNumber(int n) {
		boolean[] check= new boolean[n+1];
		for (int i =2; i<=n; i++) {
			check[i]=true;
		}
		for (int i=2; i<=Math.sqrt(n); i++) {
			for (int j=i+i; j<=n; j+=i) {
				check[j]=false;
			}
		}
		return check;
	}
}
//첫번째 풀이
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
//
//
//public class Main {
//
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int m,n;
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		m=Integer.parseInt(st.nextToken());
//		n=Integer.parseInt(st.nextToken());
//		StringBuilder sb = new StringBuilder();
//		for(int i=m; i<=n; i++) {
//			if(!check(i)) {
//				sb.append(i).append("\n");
//			}
//		}
//		System.out.print(sb.toString().trim());
//	}
//
//	public static boolean check(int a) {
//		boolean flag = false;
//		if (a == 1)
//			flag = true;
//		for (int i = 2; i <= Math.sqrt(a); i++) {
//			if (a % i == 0) {
//				flag = true;
//				break;
//			}
//		}
//		return flag;
//	}
//}