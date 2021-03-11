package B_17_스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//균형잡힌 세상
public class BOJ_4949 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		StringBuilder sb = new StringBuilder();
		Pattern p = Pattern.compile("\\(|\\)|\\[|\\]");
		Matcher m;
		
		
		Stack<String> s = new Stack<String>();
		boolean flag = false;
		while( !((str = br.readLine()).equals(".")) ) {
			m = p.matcher(str);
			while(m.find()) {
				switch(m.group()) {
				case "(" : s.add("(");
					break;
				case ")" : 
					if(!s.empty()) {
						if(s.peek().equals("(")) {
							s.pop();
						} else {
							flag = true;
							break;
						}
					} else {
						flag = true;
					}
					break;
				case "[" : s.add("[");
					break;
				case "]" : 
					if(!s.empty()) {
						if(s.peek().equals("[")) {
							s.pop();
						} else {
							flag = true;
							break;
						}
					} else {
						flag = true;
					}
					break;
				}
				if(flag) break;
			}
			if(s.empty() && !flag) {
				sb.append("yes\n");
			} else {
				sb.append("no\n");
			}
			flag = false;
			s.clear();
		}
		
		System.out.println(sb);
		
	}
}
