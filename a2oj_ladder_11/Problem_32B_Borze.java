package a2oj_ladder_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Problem_32B_Borze {

	public static FastScanner s = new FastScanner();
    public static PrintWriter out = new PrintWriter(System.out);
	
	public static void main(String[] args) {
		out.println(solve());
		out.close();
	}

	public static String solve() {
		char[] a = s.next().toCharArray();
		int n = a.length;
		if(n == 1)
			return "0"; // since we are guaranteed that the given string is a valid Borze code
		
		StringBuilder output = new StringBuilder();
		for(int i = 0; i < n; i++) {
			if(a[i] == '.')
				output.append("0");
			else if(a[i] == '-' && i+1 < n && a[i+1] == '.') {
				output.append("1");
				i++;
			}
			else if(a[i] == '-' && i+1 < n && a[i+1] == '-') {
				output.append("2");
				i++;
			}
		}
		
		return output.toString();
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
