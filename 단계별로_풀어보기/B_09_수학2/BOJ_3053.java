package B_09_수학2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_3053 {

	public final static double PI = Math.PI;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int r = Integer.parseInt(br.readLine());
		System.out.printf("%.6f\n%.6f", getArea(r), getTaxiArea(r));
	}

	static double getArea(int r) {
		double area;
		area = PI * r * r;
		return area;
	}

	static double getTaxiArea(int r) {
		double area;
		area = (double) 2 * r * r;
		return area;
	}
}
