package B_16_정수론및조합론;

import java.util.Scanner;

//팩토리얼 0의 개수
public class BOJ_1676 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(N/5+N/25+N/125);
	}
}
