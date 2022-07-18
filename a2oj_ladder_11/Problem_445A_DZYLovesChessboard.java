package a2oj_ladder_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Problem_445A_DZYLovesChessboard {

	public static FastScanner fs = new FastScanner();
    public static PrintWriter out = new PrintWriter(System.out);
	
	public static void main(String[] args) {
        solve();
        out.close();
	}

	public static void solve() {
		int n = fs.nextInt(), m = fs.nextInt();
		char[][] a = new char[n][m];
		char[][] ans = new char[n][m];
		for(int i = 0; i < n; i++) {
			char[] b = fs.next().toCharArray();
			for(int j = 0; j < m; j++) 
				a[i][j] = b[j];
		}
		
		for(int i = 0; i < n; i++) {
			if(i % 2 == 0) {
				for(int j = 0; j < m; j++) {
					if(j % 2 == 0)
						ans[i][j] = 'B';				
					else
						ans[i][j] = 'W';
				}
			}
			else {
				for(int j = 0; j < m; j++) {
					if(j % 2 == 0)
						ans[i][j] = 'W';				
					else
						ans[i][j] = 'B';
				}
			}
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) 
				out.print((a[i][j] == '-') ? '-' : ans[i][j]);
			out.println();
		}
		
		/* Initial solution that came to my mind along with the above intended solution
		int n = fs.nextInt(), m = fs.nextInt();
		char[][] a = new char[n+2][m+2];
		for(int i = 1; i < n+1; i++) {
			char[] b = fs.next().toCharArray();
			for(int j = 1; j < m+1; j++) {
				a[i][j] = b[j-1];
			}
		}
		
		char previous = 'W';
		for(int i = 1; i < n+1; i++) {
			if(i % 2 == 1)
				previous = 'W';
			else
				previous = 'B';
			for(int j = 1; j < m+1; j++) {
				if(a[i][j] == '-')
					continue;
				else if(a[i][j] == '.' && a[i-1][j] != 'B' && a[i+1][j] != 'B' && a[i][j-1] != 'B' && a[i][j+1] != 'B' && previous != 'B') {
					a[i][j] = 'B';
					previous = 'B';
				}
				else {
					a[i][j] = 'W';
					previous = 'W';
				}
			}
		}
		for(int i = 1; i < n+1; i++) {
			for(int j = 1; j < m+1; j++) 
				out.print(a[i][j]);
			out.println();
		}
		*/
	}
	
	static void sort(int[] a) {
		ArrayList<Integer> l=new ArrayList<>();
		for (int i:a) l.add(i);
		Collections.sort(l);
		for (int i=0; i<a.length; i++) a[i]=l.get(i);
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
