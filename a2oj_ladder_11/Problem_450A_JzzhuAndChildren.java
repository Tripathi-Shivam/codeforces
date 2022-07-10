package a2oj_ladder_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;


public class Problem_450A_JzzhuAndChildren {

	public static FastScanner fs = new FastScanner();
    public static PrintWriter out = new PrintWriter(System.out);
	
	public static void main(String[] args) {
        out.println(solve());
        out.close();
	}

	public static int solve() {
		int n = fs.nextInt();
		int m = fs.nextInt();
		int[] a = fs.readArray(n);
		int indexOfLast = n-1, max = 0;
		LinkedList<Pair> line = new LinkedList<>();
		for(int i = 0; i < n; i++) {
			max = Math.max(max, a[i]);
			Pair p = new Pair(i+1, a[i]);
			line.add(p);
		}
		
		if(max <= m)
			return n;
		
		while(!line.isEmpty()) {
			for(int i = 0; i < line.size(); i++) {
				Pair child = line.get(i);
				if((child.candies - m) > 0) {
//					line.remove(i);
//					line.add(new Pair(child.position, child.candies - m));
					line.set(i, new Pair(child.position, child.candies - m));
				}
				else {
					line.remove(i);
					i--;
				}
				if(line.isEmpty())
					indexOfLast = child.position;
			}
		}
		return indexOfLast;
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

class Pair {
	int position;
	int candies;
	Pair(int position, int candies) {
		this.position = position;
		this.candies = candies;
	}
}