package contests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Problem_806D {

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
		String[] a = new String[n];
		HashSet<String> set = new HashSet<>();
		for(int i = 0; i < n; i++) {
			a[i] = fs.next();
			set.add(a[i]);
		}
		
		StringBuilder ans = new StringBuilder();
		for(int i = 0; i < n; i++) {
			String b = a[i];
			int m = b.length();
			boolean thereExists = false;
			for(int j = 1; j < m; j++) {
				String one = b.substring(0, j);
				String two = b.substring(j, m);
				if(set.contains(one) && set.contains(two)) {
					ans.append(1);
					thereExists = true;
					break;
				}
			}
			if(!thereExists)
				ans.append(0);
		}
		out.println(ans.toString());
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
