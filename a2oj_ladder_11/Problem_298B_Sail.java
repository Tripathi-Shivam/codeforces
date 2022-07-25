package a2oj_ladder_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Problem_298B_Sail {

	public static FastScanner fs = new FastScanner();
    public static PrintWriter out = new PrintWriter(System.out);
	
	public static void main(String[] args) {
        out.println(solve());
        out.close();
	}

	public static int solve() {
		int t = fs.nextInt(), sx = fs.nextInt(), sy = fs.nextInt(), ex = fs.nextInt(), ey = fs.nextInt();
		char[] a = fs.next().toCharArray();
		int count = -1;
		for(int i = 0; i < t; i++) {
			switch(a[i]) {
				case 'E':
					if(sx < ex) 
						sx++;
					break;
				case 'S':
					if(sy > ey) 
						sy--;
					break;
				case 'W':
					if(sx > ex) 
						sx--;
					break;
				case 'N':
					if(sy < ey) 
						sy++;
					break;
				default:
					break;
			}
			if(sx == ex && sy == ey) {
				count = i+1;
				break;
			}
		}
		return count;
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
