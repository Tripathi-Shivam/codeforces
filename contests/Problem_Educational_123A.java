package contests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Problem_Educational_123A {

	public static FastScanner s = new FastScanner();
    public static PrintWriter out = new PrintWriter(System.out);
	
	public static void main(String[] args) {
		int testCases = s.nextInt();

        for (int i = 0; i < testCases; i++) {
//        	solve();
        	out.println(solve());
        }
        
        out.close();
	}

	public static String solve() {
		char[] a = s.next().toCharArray();
		int redKey = 0, greenKey = 0, blueKey = 0;
		for(int i = 0; i < 6; i++) {
			if(a[i] == 'r')
				redKey++;
			else if(a[i] == 'g')
				greenKey++;
			else if(a[i] == 'b')
				blueKey++;
			else if(a[i] == 'R') {
				if(redKey == 0) 
					return "NO";
				else 
					redKey--;
			}
			else if(a[i] == 'G') {
				if(greenKey == 0) 
					return "NO";
				else 
					greenKey--;
			}
			else {
				if(blueKey == 0) 
					return "NO";
				else 
					blueKey--;
			}
		}
		return "YES";
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
}
