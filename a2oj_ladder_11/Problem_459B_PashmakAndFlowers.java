package a2oj_ladder_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Problem_459B_PashmakAndFlowers {

	public static FastScanner fs = new FastScanner();
    public static PrintWriter out = new PrintWriter(System.out);
	
	public static void main(String[] args) {
        solve();
        out.close();
	}
	
	public static void solve() {
		long n = fs.nextLong();
		int[] a = new int[200005]; // since 2 <= n <= 2*10^5
		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
		long countMin = 0, countMax = 0;
		for(int i = 0; i < n; i++) {
			a[i] = fs.nextInt();
			min = Math.min(min, a[i]);
			max = Math.max(max, a[i]);
		}
		for(int i = 0; i < n; i++) {
			if(a[i] == min)
				countMin++;
			if(a[i] == max)
				countMax++;
		}
		int diff = max - min;
		out.print(diff + " ");
		if(min == max) 
			out.print(n * (n - 1) / 2);
		else 
			out.print(countMin * countMax);
	}
	
	// Initial solution (TLE)
	public static void firstSolution() {
		int n = fs.nextInt();
		int[] a = fs.readArray(n);
		sort(a);
		int j = n-1, count = 0, max = a[n-1] - a[0];
		for(int i = 0; i < n; i++) {
			j = n - 1;
			while(i < j) {
				if(a[j] - a[i] == max) {
					count++;
					j--;					
				}
				else 
					break;
			}
			
		}
		out.print(max + " " + count);
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
	
	public static String toString(char[] a) {
        StringBuilder sb = new StringBuilder();
 
        // Creating a string using append() method
        for (int i = 0; i < a.length; i++) {
            sb.append(a[i]);
        }
 
        return sb.toString();
    }
}
