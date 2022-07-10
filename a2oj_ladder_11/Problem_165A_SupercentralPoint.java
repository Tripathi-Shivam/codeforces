package a2oj_ladder_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Problem_165A_SupercentralPoint {

	public static FastScanner fs = new FastScanner();
    public static PrintWriter out = new PrintWriter(System.out);
	
	public static void main(String[] args) {
        out.println(solve());
        out.close();
	}

	public static int solve() {
		int n = fs.nextInt();
		int[][] a = new int[n][2];
		for(int i = 0; i < n; i++) {
			a[i][0] = fs.nextInt();
			a[i][1] = fs.nextInt();
		}
		int count = 0;
		for(int i = 0; i < n; i++) {
			boolean hasUpper = false, hasLower = false, hasLeft = false, hasRight = false;
			for(int j = 0; j < n; j++) {
				if(i == j)
					continue;
				if(a[i][0] == a[j][0] && a[i][1] > a[j][1])
					hasUpper = true;
				if(a[i][0] == a[j][0] && a[i][1] < a[j][1])
					hasLower = true;
				if(a[i][0] < a[j][0] && a[i][1] == a[j][1])
					hasLeft = true;
				if(a[i][0] > a[j][0] && a[i][1] == a[j][1])
					hasRight = true;
			}
			if(hasUpper && hasLower && hasLeft & hasRight)
				count++;
		}
		return count;
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
