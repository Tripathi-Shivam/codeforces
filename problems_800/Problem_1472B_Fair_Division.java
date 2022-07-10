package problems_800;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;


public class Problem_1472B_Fair_Division {

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
        int cnt1 = 0, cnt2 = 0;
        for (int i = 0; i < n; i++) {
        	int c = s.nextInt();
		    if (c == 1) {
		    	cnt1++;
		    } 
		    else {
		    	cnt2++;
		    }
    	}
        if ((cnt1 + 2 * cnt2) % 2 != 0) {
        	out.println("NO");
        } 
        else {
        	int sum = (cnt1 + 2 * cnt2) / 2;
        	if (sum % 2 == 0 || (sum % 2 == 1 && cnt1 != 0)) {
        		out.println("YES");
        	} 
        	else {
        		out.println("NO");
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
}