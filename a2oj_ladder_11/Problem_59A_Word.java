package a2oj_ladder_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Problem_59A_Word {

	public static FastScanner s = new FastScanner();
    public static PrintWriter out = new PrintWriter(System.out);
	
	public static void main(String[] args) {
		out.println(solve(s.next()));
        out.close();
	}

	public static String solve(String s) {
		StringBuilder output = new StringBuilder();
		int noOfUppercase = 0, noOfLowercase = 0;
		char[] a = s.toCharArray();
		int n = a.length;
		for(int i = 0; i < n; i++) {
			if(a[i] > 96)
				noOfLowercase++;
			else
				noOfUppercase++;
		}
		
		if(noOfLowercase >= noOfUppercase) {
			for(int i = 0; i < n; i++) {
				if(a[i] < 97) {
					char c = (char) (a[i] + 32); 
					a[i] = c;
				}
			}
		}
		else {
			for(int i = 0; i < n; i++) {
				if(a[i] >= 97) {
					char c = (char) (a[i] - 32); 
					a[i] = c;
				}
			}
		}
		
		for(char i : a) {
			output.append(i);
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
