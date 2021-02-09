package B_15_그리디알고리즘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//회의실 배정
public class BOJ_1931 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Time[] t = new Time[N];

		StringTokenizer st;
		for(int i = 0;  i<N; i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			t[i] = new Time(s, e);
		}
		Arrays.sort(t);

		int count=1;
		Time tt = t[0];
			for(int i = 1; i<N; i++) {
				if(tt.end <= t[i].start) {
					tt = t[i];
					count++;
				}
			}
		System.out.println(count);
	}
}
class Time implements Comparable<Time>{
	int start;
	int end;
	public Time (int start, int end){
		this.start = start;
		this.end = end;
	}
	@Override
	public int compareTo(Time o) {
		if(this.end > o.end) {
			return 1;
		} else if(this.end < o.end) {
			return -1;
		} else {
			if(this.start > o.start) {
				return 1;
			} else if(this.start < o.start) {
				return -1;
			} else {
				return 0;
			}
		}
	}
	@Override
	public String toString() {
		return "["+start+", "+end+"]";
	}
}