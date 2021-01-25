package B_13_백트래킹;

import java.util.*;
import java.io.*;

public class BOJ_9663 {
	static int count=0, n;
	static int prerow[] = new int[15];
	static int precol[] = new int[15];
			
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		for(int i =0; i<n; i++) {
			func(0,i);
		}
		System.out.print(count);
	}
	
	static void func(int row, int col) {
		//가지치기
		for(int i = 0; i<row; i++) {
			if(precol[i] == col) return;
			if(prerow[i] == row) return;
			if(Math.abs(prerow[i]-row) == Math.abs(precol[i]-col)) return;
		}
		//가장 깊이 도달했을때 카운트 증가
		if(row == n-1) {
			count++;
			return;
		}
		//이전 값 저장 (가지치기를 위해)
		prerow[row] = row;
		precol[row] = col;
		//깊숙히 들어간다.
		for(int i=0; i<n; i++) {
			func(row+1,i);
		}
		
	}
}
