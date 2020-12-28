package B_09_수학2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1002 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.valueOf(br.readLine());
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		while (t-- > 0) {
			st = new StringTokenizer(br.readLine());
			int[] point1 = { Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()) };
			int r1 = Integer.parseInt(st.nextToken());
			int[] point2 = { Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()) };
			int r2 = Integer.parseInt(st.nextToken());
			double distance = getDistance(point1, point2);
			if (distance == 0 && r1 == r2) {
				sb.append("-1").append("\n");
			} else if (r2 > r1 + distance || r1 > r2 + distance || r2 + r1 < distance) {
				sb.append("0").append("\n");
			} else if (r2 == r1 + distance || r1 == r2 + distance || r2 + r1 == distance) {
				sb.append("1").append("\n");
			} else {
				sb.append("2").append("\n");
			}
		}
		System.out.print(sb.toString().trim());
	}

	static double getDistance(int[] point1, int[] point2) {
		double distance = 0;
		distance = Math.sqrt(
				(point2[0] - point1[0]) * (point2[0] - point1[0]) + (point2[1] - point1[1]) * (point2[1] - point1[1]));
		return distance;
	}
}
