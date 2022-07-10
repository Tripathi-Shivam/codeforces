package contests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Problem_772B {

	public static FastScanner s = new FastScanner();
    public static PrintWriter out = new PrintWriter(System.out);
	
	public static void main(String[] args) {
		int testCases = s.nextInt();

        for (int i = 0; i < testCases; i++) {
        	solve();
//        	out.println(solve(s.nextInt()));
        }
        
        out.close();
	}

	public static void solve() {
		int n = s.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) 
			a[i] = s.nextInt();
		
		int operations = 0;
		for(int i = 1; i+1 < n; i++) {
			if(a[i-1] < a[i] && a[i+1] < a[i]) {
				operations++;
				if(i+2 < n && a[i+1] < a[i+2]) { 
					if(a[i] <= a[i+2])
						a[i+1] = a[i+2];
					else
						a[i+1] = a[i];
				}
				else 
					a[i+1] = a[i];
			}
		}
		out.println(operations);
		for(int i : a) 
			out.print(i + " ");
		
		out.println();
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
