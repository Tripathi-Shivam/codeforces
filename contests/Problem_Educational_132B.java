package contests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Problem_Educational_132B {

	public static FastScanner fs = new FastScanner();
    public static PrintWriter out = new PrintWriter(System.out);
	
	public static void main(String[] args) {
//      solve();
		solve2();
        out.close();
	}

	public static void solve2() {
		int n = fs.nextInt(), m = fs.nextInt();
		int[] a = new int[n+1];
		for(int i = 1; i < n+1; i++)
			a[i] = fs.nextInt();
		
		long[] cal1 = new long[n+1];
		long total = 0;
		for(int i = 1; i+1 < n+1; i++) {
			if(a[i] > a[i+1])
				total += a[i] - a[i+1];
		}
		
		long previousDamage = 0;
		cal1[1] = total;
		for(int i = 2; i < n+1; i++) {
			if(a[i] < a[i-1])
				previousDamage += a[i-1] - a[i];
			cal1[i] = total - previousDamage;
		}
//		out.println(Arrays.toString(cal1));
		
		long[] cal2 = new long[n+1];
		long total2 = 0;
		for(int i = n; i > 1; i--) {
			if(a[i] > a[i-1])
				total2 += a[i] - a[i-1];
		}
		
		long previousDamage2 = 0;
		cal2[n] = total2;
		for(int i = n-1; i > 0; i--) {
			if(a[i] < a[i+1])
				previousDamage2 += a[i+1] - a[i];
//			out.println("pD:" + previousDamage2 + " i:" + i);
			cal2[i] = total2 - previousDamage2;
		}
//		out.println(Arrays.toString(cal2));
		
		int[][] quest = new int[m][2];
		for(int i = 0; i < m; i++) {
			quest[i][0] = fs.nextInt();
			quest[i][1] = fs.nextInt();
		}
		
		for(int i = 0; i < m; i++) {
			long damage = 0;
			int s = quest[i][0], e = quest[i][1];
//			out.println("s:" + s + " e:" + e);
			if(s < e) {
				damage = cal1[s] - cal1[e];
			}
			else {
				damage = cal2[s] - cal2[e];
			}
			out.println(damage);
		}
	}
	
	// TLE
	public static void solve() {
		int n = fs.nextInt(), m = fs.nextInt();
		int[] a = new int[n+1];
		for(int i = 1; i < n+1; i++)
			a[i] = fs.nextInt();
		
		int[][] quest = new int[m][2];
		for(int i = 0; i < m; i++) {
			quest[i][0] = fs.nextInt();
			quest[i][1] = fs.nextInt();
		}
		
		for(int i = 0; i < m; i++) {
			int damage = 0;
			int s = quest[i][0], e = quest[i][1];
//			out.println("s:" + s + " e:" + e);
			if(s < e) {
				for(int j = s; j < e; j++) {
					if(a[j] > a[j+1])
						damage += a[j] - a[j+1];
				}
			}
			else {
				for(int j = s; j > e; j--) {
//					out.println("Damage:" + damage + "j:" + j + "j-1:" + (j-1));
					if(a[j-1] < a[j])
						damage += a[j] - a[j-1];
				}
			}
			out.println(damage);
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
