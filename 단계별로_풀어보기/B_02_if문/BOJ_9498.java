package B_02_if문;

import java.util.Scanner;

public class BOJ_9498 {
	public static void main(String[] args) {
		int score;
		Scanner sc = new Scanner(System.in);
		score = sc.nextInt();
		if (90 <= score)
			System.out.println("A");
		else if (80 <= score && score < 90)
			System.out.println("B");
		else if (70 <= score && score < 80)
			System.out.println("C");
		else if (60 <= score && score < 70)
			System.out.println("D");
		else
			System.out.println("F");
		sc.close();
	}
}
