package a2oj_ladder_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Problem_320A_MagicNumbers {

	public static FastScanner fs = new FastScanner();
    public static PrintWriter out = new PrintWriter(System.out);
	
	public static void main(String[] args) {
        out.println(solve());
        out.close();
	}

	public static String solve() {
		char[] a = fs.next().toCharArray();
		int n = a.length;
		
		for(char i : a) {
			if(i != '1' && i != '4')
				return "NO";
		}
		if(n <= 2 && a[0] != '1')
			return "NO";
			
		for(int i = 0; i+2 < n; i++) {
			if(a[i] != '1')
				return "NO";
			int count4 = 0;
			for(int j = i+1; j < n; j++) {
				if(a[j] == '4')
					count4++;
				else {
					i = j - 1;
					break;
				}
			}
			if(count4 >= 3)
				return "NO";
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
	
	public static String toString(char[] a) {
        StringBuilder sb = new StringBuilder();
 
        // Creating a string using append() method
        for (int i = 0; i < a.length; i++) {
            sb.append(a[i]);
        }
 
        return sb.toString();
    }
}
