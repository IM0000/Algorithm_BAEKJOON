package B_06_함수;

public class BOJ_4673 {
	public static int d(int n) {
		int sum = n;
		while (n > 0) {
			sum += (n % 10);
			n = (n / 10);
		}

		return sum;
	}

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		int selfNum = 10000;
		boolean[] a = new boolean[selfNum];
		for (int i = 1; i <= selfNum; i++) {
			if (d(i) - 1 < selfNum) {
				if (a[d(i) - 1] == false) {
					a[d(i) - 1] = true;
				}
			}
		}
		for (int i = 0; i <= selfNum - 1; i++) {
			if (a[i] == false) {
				sb.append(i + 1).append("\n");
			}
		}
		System.out.print(sb);
	}
}
