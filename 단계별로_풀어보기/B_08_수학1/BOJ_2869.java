package B_08_수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2869 {

	public static void main(String[] args) throws IOException {
		double[] arr;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		arr = toDouble(st);
		
		System.out.println((int) Math.ceil((arr[2] - arr[0]) / (arr[0] - arr[1])) + 1);

	}
	
	private static double[] toDouble(StringTokenizer st) {
		double[] arr = new double[st.countTokens()];
		int iter = st.countTokens();
		for(int i = 0; i<iter; i++) {
			arr[i]=Double.parseDouble(st.nextToken());
		}
		return arr;
	}
	
}
