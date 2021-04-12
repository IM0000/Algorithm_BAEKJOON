package B_18_큐_덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

//AC
public class BOJ_5430 {
	static int[] arr = new int[100000];
	static int n;
	static boolean errorflag = true;
	static boolean isRight;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		while(T-->0) {
			//테스트케이스 1개 입력받기
			String func = br.readLine();
			n = Integer.parseInt(br.readLine());
			String stringArr = br.readLine();
			isRight = true;
			
			// 받은 배열 변환해서 저장하기
			stringArr = stringArr.substring(1, stringArr.length()-1);
			String[] sArr = stringArr.split(",");
			
			LinkedList<Integer> list = new LinkedList<Integer>();
			for(int i=0; i<n; i++) {
				arr[i] = Integer.parseInt(sArr[i]);
				list.add(arr[i]);
			}
			
			for(int i=0; i<func.length(); i++) {
				char c = func.charAt(i);
				if( !errorflag ) { 
					break; 
				}
				if( c == 'R' ) {
					isRight = !isRight;
				} else if( c == 'D') {
					funcD(list);
				}
			}
			//정리하기 쉽게,,? 배열에 넣어두기
			for(int i=0; i<n; i++) {
				if(isRight) {
					arr[i] = list.poll();
				} else {
					arr[i] = list.pollLast();				
				}
			}
			
			if( !errorflag ) {
				sb.append("error\n");
			} else {
				sb.append("[");
				for(int i=0; i<n; i++) {
					if(i == n-1) {
						sb.append(arr[i]);
						continue;
					}
					sb.append(arr[i]).append(",");
				}
				sb.append("]\n");
			}
			errorflag = true;
		}
		System.out.print(sb);
	}
	
	public static void funcD(LinkedList<Integer> l) {
		if(n != 0) {
			if(isRight) {
				l.poll();				
			} else {
				l.pollLast();
			}
			n--;
		} else {
			errorflag = false;
		}
//	public static void funcR(LinkedList<Integer> l) {
//		for(int i=0; i<n; i++) {
//			l.add(arr[i]);
//		}
//		for(int i=0; i<n; i++) {
//			arr[i] = l.pollLast();
//		}
//	}
	}
}
