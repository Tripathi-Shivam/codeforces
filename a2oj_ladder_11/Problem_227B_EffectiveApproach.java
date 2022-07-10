package a2oj_ladder_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Problem_227B_EffectiveApproach {

	public static FastScanner fs = new FastScanner();
    public static PrintWriter out = new PrintWriter(System.out);
	
	public static void main(String[] args) {
		solve();
        out.close();
	}

	public static void solve() {
		int n = fs.nextInt();
		int[] a = fs.readArray(n);
		int m = fs.nextInt();
		int[] b = fs.readArray(m);
		
		long countV = 0, countP = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < n; i++) {
			map.put(a[i], i);
		}
		for(int i = 0; i < m; i++) {
			if(map.containsKey(b[i])) {
				int index = map.get(b[i]);
				countV += index + 1;
				countP += n - index;
			}
		}
		
		out.println(countV + " " + countP);
		// Time limit exceeded for below approch
/*		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				if(a[j] == b[i]) {
					countV++;
					break;
				}
				countV++;
			}
		}
		for(int i = m-1; i >= 0; i--) {
			for(int j = n-1; j >=0; j--) {
				if(a[j] == b[i]) {
					countP++;
					break;
				}
				countP++;
			}
		}
		out.println(countV + " " + countP);
*/
	}
	
	static class FastScanner {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer("");
		
		String next() {
			while(!st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch(IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}
		
		int nextInt() {
            return Integer.parseInt(next());
        }
 
        int[] readArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i<n; i++) a[i]=nextInt();
            return a;
        }
 
        long nextLong() {
            return Long.parseLong(next());
        }
	}
	
	public static String toString(char[] a) {
        StringBuilder sb = new StringBuilder();
 
        // Creating a string using append() method
        for (int i = 0; i < a.length; i++) {
            sb.append(a[i]);
        }
 
        return sb.toString();
    }
}
