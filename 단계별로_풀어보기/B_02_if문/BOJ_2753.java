package B_02_if문;

import java.util.Scanner;

public class BOJ_2753 {
	public static void main(String[] args) {
		int a;
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
		s.close();
	}
}
