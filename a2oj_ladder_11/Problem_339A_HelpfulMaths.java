package a2oj_ladder_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Problem_339A_HelpfulMaths {

	public static FastScanner fs = new FastScanner();
    public static PrintWriter out = new PrintWriter(System.out);
	
	public static void main(String[] args) {
        solve();
        out.close();
	}

	public static void solve() {
		String s = fs.next();
		char[] a = s.toCharArray();
		int count1 = 0, count2 = 0, count3 = 0;
		for(char i : a) {
			if(i == '1')
				count1++;
			else if(i == '2')
				count2++;
			else if(i == '3')
				count3++;
		}
		StringBuilder ans = new StringBuilder();
		while(count1 > 0) {
			ans.append("1+");
			count1--;
		}
		while(count2 > 0) {
			ans.append("2+");
			count2--;
		}
		while(count3 > 0) {
			ans.append("3+");
			count3--;
		}
		int n = ans.length();
		out.println(ans.toString().substring(0, n-1));
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
