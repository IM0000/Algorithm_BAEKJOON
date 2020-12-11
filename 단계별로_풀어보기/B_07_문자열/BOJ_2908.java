package B_07_문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2908 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int a = Integer.parseInt(reverseString(str[0]));
		int b = Integer.parseInt(reverseString(str[1]));
		if (a > b) {
			System.out.println(a);
		} else {
			System.out.println(b);
		}
	}

	public static String reverseString(String str) {
		StringBuilder sb = new StringBuilder(str);
		str = sb.reverse().toString();
		return str;
	}
}
