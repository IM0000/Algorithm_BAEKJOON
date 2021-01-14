package B_12_정렬;

import java.io.*;
import java.util.*;
public class BOJ_11650 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.valueOf(br.readLine());
		ArrayList<Point> list = new ArrayList<>();
		StringTokenizer st;
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			list.add(new Point(Integer.valueOf(st.nextToken()), Integer.valueOf(st.nextToken())));
		}
		
		Collections.sort(list);
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<n; i++) {
			sb.append(list.get(i)).append("\n");
		}
		
		System.out.print(sb.toString().trim());
	}

}

class Point implements Comparable<Point> {
	int x;
	int y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public int compareTo(Point p) {
		if (this.x > p.x)
			return 1;
		else if (this.x < p.x)
			return -1;
		else {
			if (this.y > p.y)
				return 1;
			else if (this.y < p.y)
				return -1;
			else
				return 0;
		}
	}
	@Override
	public String toString() {
		return this.x+" "+this.y;
	}
}