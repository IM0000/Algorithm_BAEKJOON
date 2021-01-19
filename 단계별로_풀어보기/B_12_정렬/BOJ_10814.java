package B_12_정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ_10814 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		List<User> list = new ArrayList<>();
		StringTokenizer st;
		for(int i = 0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			int age = Integer.valueOf(st.nextToken());
			String name = st.nextToken();
			list.add(new User(age, name));
		}
		Collections.sort(list);
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i<n; i++) {
			sb.append(list.get(i)).append("\n");
		}
		System.out.print(sb);
		
	}

}
class User implements Comparable<User>{
	int age;
	String name;
	User(int age, String name){
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() {
		return this.age+" "+this.name;
	}
	@Override
	public int compareTo(User u) {
		return this.age - u.age;
	}
}