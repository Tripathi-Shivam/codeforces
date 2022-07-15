package a2oj_ladder_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Problem_230A_Dragons {

	public static FastScanner fs = new FastScanner();
    public static PrintWriter out = new PrintWriter(System.out);
	
	public static void main(String[] args) {        
        out.println(solve());
        out.close();
	}

	public static String solve() {
		int s = fs.nextInt(), n = fs.nextInt();
		int[] a = new int[n];
		HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
		for(int i = 0; i < n; i++) {
			a[i] = fs.nextInt();
			if(map.containsKey(a[i]))
				map.get(a[i]).add(fs.nextInt());
			else {
				ArrayList<Integer> b = new ArrayList<>();
				b.add(fs.nextInt());
				map.put(a[i], b);
			}
		}
		sort(a);
//		out.println(Arrays.toString(a));
//		out.println(map);
		HashSet<Integer> visited = new HashSet<>();
		for(int i = 0; i < n; i++) {
//			out.println(s);
			if(visited.contains(a[i]))
				continue;
			if(a[i] < s) {
				visited.add(a[i]);
				ArrayList<Integer> bonus = map.get(a[i]);
				for(int j = 0; j < bonus.size(); j++) {
					s += bonus.get(j);
				}
			}
			else 
				return "NO";
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
	
	public static String toString(char[] a) {
        StringBuilder sb = new StringBuilder();
 
        // Creating a string using append() method
        for (int i = 0; i < a.length; i++) {
            sb.append(a[i]);
        }
 
        return sb.toString();
    }
}
