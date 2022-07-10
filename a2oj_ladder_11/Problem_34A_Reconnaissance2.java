package a2oj_ladder_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Problem_34A_Reconnaissance2 {

	public static FastScanner fs = new FastScanner();
    public static PrintWriter out = new PrintWriter(System.out);
	
	public static void main(String[] args) {
        solve();
        out.close();
	}

	public static void solve() {
		int n = fs.nextInt();
		int[] a = fs.readArray(n);
		int[] difference = new int[n];
		int min = 1001;
		for(int i = 0; i+1 < n; i++) {
			difference[i] = Math.abs(a[i] - a[i+1]);
			min = Math.min(min, Math.abs(a[i] - a[i+1]));
		}
		if(min > Math.abs(a[0] - a[n-1])) {
			out.println(1 + " " + n);
		}
		else {
			for(int i = 0; i+1 < n; i++) {
				if(difference[i] == min) {
					out.println(i+1 + " " + (i+2));
					return;
				}
			}
		}
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
