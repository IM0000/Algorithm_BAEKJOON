package B_16_정수론및조합론;

import java.util.Scanner;

//최대공약수와 최소공배수
public class BOJ_2609 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int gcd, lcm;
		
		//gcd
		int tmp;
		int A = a;
		int B = b;
		
		while( (tmp = A%B) !=0 ) {
			A = B;
			B = tmp;
		}
		gcd = B;
		
		lcm = a*b/gcd;
		
		System.out.printf("%d\n%d", gcd, lcm);
	}
}
