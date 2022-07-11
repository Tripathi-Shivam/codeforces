package contests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Problem_805D {

	public static FastScanner fs = new FastScanner();
    public static PrintWriter out = new PrintWriter(System.out);
	
	public static void main(String[] args) {
		int testCases = fs.nextInt();

        for (int i = 0; i < testCases; i++) {
        	out.println(solve());
        }
        
        out.close();
	}

	public static String solve() {
		String w = fs.next();
		int p = fs.nextInt();
		int total = 0, n = w.length();
		int[] a = new int[27];
		for(int i = 0; i < n; i++) {
			total += (int) (w.charAt(i) - 97) + 1;
			a[(w.charAt(i) + 1) - 97]++;
		}
		if(total <= p) 
			return w;
		for(int i = 26; i > 0; i--) {
			while(a[i] != 0 && total > p) {
				total -= i;
				a[i]--;
			}
		}
		
		StringBuilder ans = new StringBuilder();
		if(total <= 0)
			return ans.toString();
		for(int i = 0; i < n; i++) {
			if(a[(w.charAt(i) + 1) - 97] > 0) {
				ans.append(w.charAt(i));
				a[(w.charAt(i) + 1) - 97]--;
			}
		}
		return ans.toString();
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
