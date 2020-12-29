package B_10_재귀;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class BOJ_2447 {
	static char[][] table;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.valueOf(br.readLine());
		table = new char[n][n];
		for(int i =0; i<table.length; i++) {
			Arrays.fill(table[i], ' ');
		}
		makeStarBox(0,0,n);
		printStarBox(n);
	}
	
	static void printStar(int y, int x) {
		table[y+0][x+0]='*';
		table[y+0][x+1]='*';
		table[y+0][x+2]='*';
		table[y+1][x+0]='*';
		table[y+1][x+1]=' ';
		table[y+1][x+2]='*';
		table[y+2][x+0]='*';
		table[y+2][x+1]='*';
		table[y+2][x+2]='*';
	}
	static void makeStarBox(int y, int x, int n) {
		if(n<3)
			return;
		if(n==3) {
			printStar(y,x);
			return;
		}
		makeStarBox(y+0, x+0, n/3);
		makeStarBox(y+0, x+n/3, n/3);
		makeStarBox(y+0, x+n/3*2, n/3);
		makeStarBox(y+n/3, x+0, n/3);
		makeStarBox(y+n/3, x+n/3*2, n/3);
		makeStarBox(y+n/3*2, x+0, n/3);
		makeStarBox(y+n/3*2, x+n/3, n/3);
		makeStarBox(y+n/3*2, x+n/3*2, n/3);
	}
	static void printStarBox(int n) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int i=0;i<n;i++) {
			bw.write(table[i]);
			bw.write("\n");
		}
		bw.flush();
		bw.close();
	}
}
