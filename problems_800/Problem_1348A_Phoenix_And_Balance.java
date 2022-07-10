package problems_800;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;


public class Problem_1348A_Phoenix_And_Balance {

	public static FastScanner s = new FastScanner();
    public static PrintWriter out = new PrintWriter(System.out);
	
	public static void main(String[] args) {
		int testCases = s.nextInt();

        for (int i = 0; i < testCases; i++) {
        	solve();
//        	out.println(solve());
        }
        
        out.close();
	}

	public static void solve() {
		
		    int N = s.nextInt();
		    int sum1=(1<<N), sum2=0;
		    //we put n/2-1 smallest coins in first pile
		    for (int i=1;i<N/2;i++)
		      sum1+=(1<<i);
		    //we put remaining n/2 coins in second pile
		    for (int i=N/2;i<N;i++)
		      sum2+=(1<<i);
		    out.println(sum1-sum2);
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