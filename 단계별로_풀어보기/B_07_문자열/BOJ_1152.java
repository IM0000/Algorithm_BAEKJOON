package B_07_문자열;

import java.io.IOException;

public class BOJ_1152 {
	public static void main(String[] args) throws IOException {

		int cnt = 0;
		int predecessor = ' ';
		while (true) {
			int ch = System.in.read();
			if (ch == '\n') {
				if (predecessor != ' ')
					cnt++;
				break;
			}
			if (ch == ' ') {
				if (predecessor != ' ')
					cnt++;
			}
			predecessor = ch;
		}
		System.out.println(cnt);
	}
}
