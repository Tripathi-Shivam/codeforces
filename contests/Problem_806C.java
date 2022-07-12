package contests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Problem_806C {

	public static FastScanner fs = new FastScanner();
    public static PrintWriter out = new PrintWriter(System.out);
	
	public static void main(String[] args) {
		int testCases = fs.nextInt();

        for (int i = 0; i < testCases; i++) {
        	solve();
//        	out.println(solve());
        }
        
        out.close();
	}

	public static void solve() {
		int n = fs.nextInt();
		int[] a = fs.readArray(n);
		for(int i = 0; i < n; i++) {
			int noOfMoves = fs.nextInt();
			String moves = fs.next();
			for(int j = 0; j < noOfMoves; j++) {
				if(moves.charAt(j) == 'U') {
					a[i]--;
					if(a[i] < 0)
						a[i] = 9;
				}
				else {
					a[i]++;
					if(a[i] > 9)
						a[i] = 0;
				}
			}
		}
		for(int i = 0; i < n; i++) {
			out.print(a[i] + " ");
		}
		out.println();
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
}