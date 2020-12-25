package B_09_수학2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1085 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x,y,w,h,min;
		StringTokenizer st = new StringTokenizer(br.readLine());
		x=Integer.parseInt(st.nextToken());
		y=Integer.parseInt(st.nextToken());
		w=Integer.parseInt(st.nextToken());
		h=Integer.parseInt(st.nextToken());
		min=x;
		if(x>y) {
			min=y;
		}
		if((w-x)<min){
			min=w-x;
		}
		if(h-y<min){
			min=h-y;
		}
		System.out.print(min);
	}

}
