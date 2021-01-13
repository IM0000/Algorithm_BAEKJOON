package B_12_정렬;

import java.io.*;

public class BOJ_2108 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.valueOf(br.readLine());
		int[] sortedArr = new int[n];
		int[] count = new int[8001];
		for (int i = 0; i < n; i++) {
			count[4000 + Integer.valueOf(br.readLine())]++;
		}

		int countMax = 0;
		int modeFirst = 0;
		int modeSecond = -1;
		for (int i = 8000; i >= 0; i--) {
			if (count[i] > countMax) {
				countMax = count[i];
				modeFirst = i;
			} else if (count[i] == countMax && countMax!=0) {
				modeSecond = modeFirst;
				modeFirst = i;
			}
		}
		int mode;
		if (modeSecond == -1) {
			mode = modeFirst;
		} else if (count[modeFirst]>count[modeSecond]) {
			mode = modeFirst;			
		} else {
			mode = modeSecond;
		}

		for (int i = 0, k = 0; i < 8001; i++) {
			if (count[i] != 0) {
				int j = 0;
				while (j < count[i]) {
					sortedArr[k] = i-4000;
					j++;
					k++;
				}
			}
			if (k == n)
				break;
		}
		StringBuilder sb= new StringBuilder();
		int sum=0;
		for(int i=0; i<n; i++) {
			sum+=sortedArr[i];
		}
		
		sb.append(Math.round(sum /(double)n)).append("\n");
		sb.append(sortedArr[n/2]).append("\n");
		sb.append(mode-4000).append("\n");
		sb.append(sortedArr[n-1]-sortedArr[0]);
		System.out.println(sb);
	}
}
