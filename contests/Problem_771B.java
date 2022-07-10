package contests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Problem_771B {

	public static FastScanner s = new FastScanner();
    public static PrintWriter out = new PrintWriter(System.out);
	
	public static void main(String[] args) {
		int testCases = s.nextInt();

        for (int i = 0; i < testCases; i++) {
//        	solve(s);
        	out.println(solve(s.nextInt()));
        }
        
        out.close();
	}

	public static String solve(int n) {
		int[] a = s.readArray(n);
		ArrayList<Integer> even = new ArrayList<>();
		ArrayList<Integer> odd = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			if((a[i] & 1) == 0) 
				even.add(a[i]);
			else
				odd.add(a[i]);
		}
		
		for(int i = 0; i+1 < even.size(); i++) {
			if(even.get(i) > even.get(i+1))
				return "No";
		}
		for(int i = 0; i+1 < odd.size(); i++) {
			if(odd.get(i) > odd.get(i+1))
				return "No";
		}
		
		return "Yes";
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
