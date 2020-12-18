package B_08_수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2775 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int floor;
		int roomNum;
		StringBuilder sb = new StringBuilder();
		while(t-- >0) {
			floor = Integer.parseInt(br.readLine());
			roomNum = Integer.parseInt(br.readLine());
			sb.append(getNum(floor, roomNum)+"\n");
		}
		System.out.print(sb);
	}
	public static int getNum(int a, int b) {
		if(b==1)
			return 1;
		if(a==0)
			return b;
		return (getNum(a-1, b)+getNum(a, b-1));
	}

}
