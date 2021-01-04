package B_11_브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_7568 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.valueOf(br.readLine());
		Person[] person = new Person[n];
		int idx = 0;
		while (n-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			person[idx] = new Person(Integer.valueOf(st.nextToken()), Integer.valueOf(st.nextToken()));
			idx++;
		}
		for (int i = 0; i < person.length - 1; i++) {
			for (int j = i + 1; j < person.length; j++) {
				if (person[i].weight < person[j].weight && person[i].height < person[j].height) {
					person[i].grade++;
				} else if (person[i].weight > person[j].weight && person[i].height > person[j].height) {
					person[j].grade++;
				}
			}
		}
		for (int i = 0; i < person.length; i++) {
			sb.append(person[i].grade).append(" ");
		}
		System.out.print(sb);
	}

}

class Person {
	public int weight;
	public int height;
	public int grade = 1;

	Person(int weight, int height) {
		this.weight = weight;
		this.height = height;
	}
}