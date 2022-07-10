package contests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Problem_772A {

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
		
		int[] powerOfTwo = new int[30];
		int globalIndex = 0;
		for(int i = 0; i < n; i++) {
			int index = 0;
			while(a[i] > 0) {
				powerOfTwo[index] = Math.max(a[i] % 2, powerOfTwo[index]);
				a[i] /= 2;
				index++;
			}
			globalIndex = Math.max(globalIndex, index);
		}
		int result = powerOfTwo[0], x = 1;
		for(int i = 1; i < globalIndex; i++) {
			x *= 2;
			result += x * powerOfTwo[i];
		}
		out.println(result);
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
