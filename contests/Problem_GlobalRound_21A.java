package contests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Problem_GlobalRound_21A {

	public static FastScanner fs = new FastScanner();
    public static PrintWriter out = new PrintWriter(System.out);
	
	public static void main(String[] args) {
		int testCases = fs.nextInt();

        for (int i = 0; i < testCases; i++) {
//        	solve();
//        	out.println(solve());
        	out.println(test3());
        }
        
        out.close();
	}

	public static int solve() {
		int n = fs.nextInt();
		int z = fs.nextInt();
		int[] a = fs.readArray(n);
		int max = 0;
		for(int i : a)
			max = Math.max(max, i);
		return (z | max);
	}
	
	public static int test() {
		int n = fs.nextInt();
		int z = fs.nextInt();
		int[] a = fs.readArray(n);
		int max = 0;
		for(int i : a)
			max = Math.max(max, i);
		for(int i : a) 
			out.print((i | z) + " ");
		
		out.println();
		
		for(int i : a) 
			out.print((i & z) + " ");
		
		return (z | max);
	}
	
	public static int test2() {
		int n = fs.nextInt();
		int z = fs.nextInt();
		int[] a = fs.readArray(n);
		int[] b = new int[n];
		int maxXOR = 0,indexOfMaxXOR = 0; 
		for(int i = 0; i < n; i++) {
			b[i] = (a[i] ^ z);
			maxXOR = Math.max(maxXOR, b[i]);
		}
		for(int i = 0; i < n; i++) {
			if(b[i] == maxXOR) {
				indexOfMaxXOR = i;
				break;
			}
		}
		
		return (a[indexOfMaxXOR] | z);
	}
	
	public static int test3() {
		int n = fs.nextInt();
		int z = fs.nextInt();
		int[] a = fs.readArray(n);
		int[] b = new int[n];
		int maxOR = 0; 
		for(int i = 0; i < n; i++) {
			b[i] = (a[i] | z);
			maxOR = Math.max(maxOR, b[i]);
		}
		return maxOR;
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
