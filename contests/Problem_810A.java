package contests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Problem_810A {

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
		if(n == 1) {
			out.println(1);
			return;
		}
		StringBuilder ans = new StringBuilder();
		int[] a = new int[n+1];
		for(int i = 1; i <= n; i += 2) 
			a[i] = i + 1;
		
		for(int i = 2; i <= n; i += 2) 
			a[i] = i - 1;
		
		if(n % 2 != 0) {
			a[1] = n;
			a[n] = 2;
		}
		for(int i = 1; i <= n; i++) {
			out.print(a[i] + " ");
		}
		out.println();
//			ans.append((i+1) + " " + i + " ");
		
//		out.println(ans.toString().substring(0, n+1));
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
