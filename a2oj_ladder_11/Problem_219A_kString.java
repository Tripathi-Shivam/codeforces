package a2oj_ladder_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Problem_219A_kString {

	public static FastScanner fs = new FastScanner();
    public static PrintWriter out = new PrintWriter(System.out);
	
	public static void main(String[] args) {
        solve();
        out.close();
	}

	public static void solve() {
		int k = fs.nextInt();
		String s = fs.next();
		int n = s.length();
		int[] a = new int[26];
		
		for(int i = 0; i < n; i++) 
			a[s.charAt(i) - 97]++;
		
		for(int i = 0; i < 26; i++) {
			if(a[i] != 0 && a[i] % k != 0) {
				out.println(-1);
				return;
			}
		}
		
		StringBuilder ans = new StringBuilder();
		for(int i = 0; i < 26; i++) {
			if(a[i] > 0) {
				for(int j = 1; j <= (a[i] / k); j++)
					ans.append((char) (i + 97));
			}
		}
		String temp = ans.toString();
		for(int i = 1; i < k; i++) {
			ans.append(temp);
		}
		out.println(ans);
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
