package B_04_while문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1110 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(br.readLine());
		int count = 0;
		int result = number;
		do {
			result = (((result % 10) * 10) + ((result / 10) + (result % 10)) % 10);
			count++;
		} while (result != number);
		System.out.print(count);
	}
}
