package contests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Problem_GlobalRound_21B {

	public static FastScanner fs = new FastScanner();
    public static PrintWriter out = new PrintWriter(System.out);
	
	public static void main(String[] args) {
		int testCases = fs.nextInt();

        for (int i = 0; i < testCases; i++) {
//        	solve();
        	out.println(solve());
        }
        
        out.close();
	}

	public static int solve() {
		int n = fs.nextInt();
		int[] a = fs.readArray(n);
		int operations = 0;
		for (int i = 0; i < n; i++) {
			if(a[i] == 0) 
				continue;
			while(i < n && a[i] != 1) {
				i++;
			}
			operations++;
		}
		return operations;
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
