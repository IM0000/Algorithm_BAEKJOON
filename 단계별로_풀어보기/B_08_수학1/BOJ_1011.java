package B_08_수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1011 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		int x, y;
		StringTokenizer st;
		while (t-- > 0) {
			st = new StringTokenizer(br.readLine());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			
			int distance = y - x;
			int max = (int) Math.sqrt(distance);
			
			if (max == Math.sqrt(distance)) {
				sb.append(2 * max - 1).append("\n");
			} else if (distance <= max * max + max) {
				sb.append(2 * max).append("\n");
			} else {
				sb.append(2 * max + 1).append("\n");
			}
		}
		System.out.print(sb);
	}
}

// 재귀함수 (시간초과)
//	public static int a(int i) {
//		if (i == 0)
//			return 0;
//		return a(i - 1) + ((i - 1) / 2 + 1);
//	}
// 배열 값을 0부터 계산에서 구하기 (시간초과)
//	public static int a(int i) {
//		if (i == 0)
//			return 0;
//		if (i==1)
//			return 1;
//		int seq = 0;
//		for (int j = 0; j < i; j++) {
//			seq += j / 2 + 1;
//		}
//		return seq;
//	}
// 값을 수식을 통해 바로 구하기 (시간초과)
//	public static int a(int i) {
//		if (i == 0)
//			return 0;
//		if (i == 1)
//			return 1;
//		int n = i / 2;
//		int value = n * (n + 1);
//		if (i % 2 != 0)
//			value += (i - 1) / 2 + 1;
//		return value;
//	}
//
//	public static int minimum(int i) {
//		int j = (int) Math.sqrt(i);
//		while (a(j) < i) {
//			j++;
//		}
//		return j;
//	}
//}