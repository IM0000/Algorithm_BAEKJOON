package B_07_문자열;

import java.io.IOException;

public class BOJ_1157 {
	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		char[] ch = br.readLine().toCharArray();
		int[] arr = new int[26];
		for (int i = System.in.read(); i >= 'A'; i = System.in.read()) {
			if (i > 'Z') {
				arr[i - 'a']++;
			} else {
				arr[i - 'A']++;
			}
		}
		int max = 0, index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				index = i;
			} else if (arr[i] == max) {
				index = -1;
			}
		}

		char maxChar = (char) ('A' + index);
		if (index == -1) {
			System.out.println("?");
		} else {
			System.out.println(maxChar);
		}
	}
}
