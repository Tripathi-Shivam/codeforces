package contests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Problem_805C {

	public static FastScanner fs = new FastScanner();
    public static PrintWriter out = new PrintWriter(System.out);
	
	public static void main(String[] args) {
		int testCases = fs.nextInt();

        for (int i = 0; i < testCases; i++) {
        	solve();
//        	out.println("TestCase: " + i);
        }
        
        out.close();
	}

	public static void solve() {
//		fs.next();
		int n = fs.nextInt();
		int k = fs.nextInt();
		int[] u = fs.readArray(n);
		int[][] q = new int[k][2];
		for(int i = 0; i < k; i++) {
			q[i][0] = fs.nextInt();
			q[i][1] = fs.nextInt();
		}
		HashMap<Integer ,ArrayList<Integer>> map = new HashMap<>();
		for(int i = 0; i < n; i++) {
			if(map.containsKey(u[i])) {
				map.get(u[i]).add(i);
			}
			else {
				ArrayList<Integer> index = new ArrayList<>();
				index.add(i);
				map.put(u[i], index);
			}
		}
		for(int i = 0; i < k; i++) {
			int a = q[i][0];
			int b = q[i][1];
			ArrayList<Integer> indexA = map.get(a);
			ArrayList<Integer> indexB = map.get(b);
			if(indexA == null || indexB == null) {
				out.println("NO");
				continue;
			}
			int minIndexA = indexA.get(0), maxIndexB = indexB.get(indexB.size() - 1);
//			int minIndexA = n, maxIndexB = -1;
//			for(int j = 0; j < indexA.size(); j++) 
//				minIndexA = Math.min(minIndexA, indexA.get(j));
//			for(int j = 0; j < indexB.size(); j++) 
//				maxIndexB = Math.max(maxIndexB, indexB.get(j));
			
			if(minIndexA < maxIndexB)
				out.println("YES");
			else
				out.println("NO");
		}
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
