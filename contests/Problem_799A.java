package contests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Problem_799A {

	public static FastScanner s = new FastScanner();
    public static PrintWriter out = new PrintWriter(System.out);
	
	public static void main(String[] args) {
		int testCases = s.nextInt();

        for (int i = 0; i < testCases; i++) {
//        	solve();
        	out.println(solve(s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt()));
        }
        
        out.close();
	}

	public static int solve(int a, int b, int c, int d) {
		int ans = 0; 
		if(a <= b)
			ans++;
		if(a <= c)
			ans++;
		if(a <= d)
			ans++;
		
		return ans;
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
