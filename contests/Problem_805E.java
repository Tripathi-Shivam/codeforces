package contests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Problem_805E {

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
		int n = fs.nextInt();
		int[][] a = new int[n][2];
		for(int i = 0; i < n; i++) {
			a[i][0] = fs.nextInt();
			a[i][1] = fs.nextInt();
		}
		HashSet<Integer> setOne = new HashSet<>();
		HashSet<Integer> setTwo = new HashSet<>();
		for(int i = 0; i < n; i++) {
			if(a[i][0] == a[i][1])
				return "NO";
			if((setOne.contains(a[i][0]) || setOne.contains(a[i][1])) && (setTwo.contains(a[i][0]) || setTwo.contains(a[i][1])))
				return "NO";
			if(!setOne.contains(a[i][0]) && !setOne.contains(a[i][1])) {
				setOne.add(a[i][0]);
				setOne.add(a[i][1]);
			}
			else if(!setTwo.contains(a[i][0]) && !setTwo.contains(a[i][1])) {
				setTwo.add(a[i][0]);
				setTwo.add(a[i][1]);
			}
		}
		return "YES";
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
