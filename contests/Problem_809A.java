package contests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Problem_809A {

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
		int n = fs.nextInt(), m = fs.nextInt();
		int[] a = new int[n+1];
		for(int i = 1; i <= n; i++) 
			a[i] = fs.nextInt();
		
		char[] b = new char[m+1];
		Arrays.fill(b, 'B');
		for(int i = 1; i <= n; i++) {
			int index1 = a[i];
			int index2 = (m + 1) - a[i];
			if(b[index1] == 'A')
				b[index2] = 'A';
			else if(b[index2] == 'A')
				b[index1] = 'A';
			else if(index1 <= index2) {
				b[index1] = 'A';
			}
			else 
				b[index2] = 'A';
		}
		StringBuilder ans = new StringBuilder();
		for(int i = 1; i <= m; i++)
			ans.append(b[i]);
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
