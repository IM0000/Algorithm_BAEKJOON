package B_09_수학2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1978 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int num;
		int count = 0;

		while (n-- > 0) {
			num = Integer.parseInt(st.nextToken());
			if (num == 1)
				continue;
			if (!check(num))
				count++;

		}
		System.out.print(count);
	}

	public static boolean check(int a) {
		boolean flag = false;
		for (int i = 2; i <= Math.sqrt(a); i++) {
			if (a % i == 0) {
				flag = true;
				break;
			}
		}
		return flag;
	}

}
