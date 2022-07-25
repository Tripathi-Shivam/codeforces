package contests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Problem_809B {

	public static FastScanner fs = new FastScanner();
    public static PrintWriter out = new PrintWriter(System.out);
	
	public static void main(String[] args) {
		int testCases = fs.nextInt();

        for (int i = 0; i < testCases; i++) {
        	out.println(solve());
        }
        
        out.close();
	}

	public static int solve() {
		int n = fs.nextInt();
		int[] a = fs.readArray(n);
		HashSet<Integer> set = new HashSet<>();
		for(int i = 1; i+1 < n; i++) {
			if(a[i] > a[i-1] && a[i] > a[i+1]) {
				set.add(i);
				set.add(i-1);
				set.add(i+1);
			}
		}
		int floors = 0;
		for(int i = 1; i+1 < n; i++) {
			if(!set.contains(i)) {
				floors += Math.max(a[i-1], a[i+1]) - a[i] + 1;
				set.add(i);
				set.add(i-1);
				set.add(i+1);
				a[i] += Math.max(a[i-1], a[i+1]) - a[i] + 1;
			}
		}
		out.println(Arrays.toString(a));
		return floors;
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
