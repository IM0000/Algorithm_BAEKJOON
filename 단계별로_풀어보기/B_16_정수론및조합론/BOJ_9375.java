package B_16_정수론및조합론;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.HashMap;
import java.util.StringTokenizer;

//패션왕 신해빈
public class BOJ_9375 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();

		while(T-- > 0) {
			int n = Integer.parseInt(br.readLine());
			StringTokenizer st;
			HashMap<String, Integer> m = new HashMap<String, Integer>();
			for(int i=0; i<n; i++) {
				st = new StringTokenizer(br.readLine());
				st.nextToken();
				
				String strKey = st.nextToken();
				if(m.containsKey(strKey)) {
					m.replace( strKey, m.get(strKey)+1 );
				} else {
					m.put(strKey, 1);
				}
			}
			
			int res = 1;
			Collection<Integer> values = m.values();
			for(Integer value : values) {
				res *= value+1 ;
			}
			
			res--;
			sb.append(res).append("\n");
		}
		System.out.print(sb.toString().trim());
	}
}
