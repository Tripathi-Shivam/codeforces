package contests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Problem_801A {

	public static FastScanner s = new FastScanner();
    public static PrintWriter out = new PrintWriter(System.out);
	
	public static void main(String[] args) {
		int testCases = s.nextInt();

        for (int i = 0; i < testCases; i++) {
        	out.println(solve(s.nextInt(), s.nextInt()));
        }
        
        out.close();
	}

	public static int solve(int n, int m) {
		int max = Integer.MIN_VALUE;
		int[][] a = new int[n][m];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				a[i][j] = s.nextInt();
				max = Math.max(max, a[i][j]);
			}
		}
		int ans = n*m;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(a[i][j] == max) {
					int possibleAns = (i + 1) * (j + 1);
					possibleAns = Math.max(possibleAns, (i + 1) * (m - j));
					possibleAns = Math.max(possibleAns, (n - i) * (j + 1));
					possibleAns = Math.max(possibleAns, (n - i) * (m - j));
					ans = Math.min(ans, possibleAns);
					break;
				}
			}
		}
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
