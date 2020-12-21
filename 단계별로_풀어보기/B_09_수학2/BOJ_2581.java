package B_09_수학2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2581 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int m,n;
		m=Integer.parseInt(br.readLine());
		n=Integer.parseInt(br.readLine());
		int sum=0;
		int min=-1;
		for(int i =n; i>=m;i--) {
			if(!check(i)) {
				sum+=i;
				min=i;
			}
		}
		if(min==-1) {
			System.out.print(min);
		}else {
			System.out.printf("%d\n%d", sum, min);
		}
	}
	public static boolean check(int a) {
		boolean flag = false;
		if (a==1) flag = true;
		for (int i = 2; i <= Math.sqrt(a); i++) {
			if (a % i == 0) {
				flag = true;
				break;
			}
		}
		return flag;
	}
}
