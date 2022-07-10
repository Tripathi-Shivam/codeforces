package a2oj_ladder_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Problem_352A_JeffAndDigits {

	public static FastScanner fs = new FastScanner();
    public static PrintWriter out = new PrintWriter(System.out);
	
	public static void main(String[] args) {
        solve();
        out.close();
	}

	public static void solve() {
		int n = fs.nextInt();
		int[] a = fs.readArray(n);
		int count5 = 0, count0 = 0;
		for(int i : a) {
			if(i == 0)
				count0++;
			if(i == 5)
				count5++;
		}
		if(count0 == 0) {
			out.println(-1);
			return;
		}
		if(count5 < 9) {
			out.println(0);
			return;
		}
		count5 = count5 - (count5 % 9);
		for(int i = 0; i < count5; i++) 
			out.print(5);
		for(int i = 0; i < count0; i++) 
			out.print(0);
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