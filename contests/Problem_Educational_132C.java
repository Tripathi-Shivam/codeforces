package contests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Problem_Educational_132C {

	public static FastScanner fs = new FastScanner();
    public static PrintWriter out = new PrintWriter(System.out);
	
	public static void main(String[] args) {
		int testCases = fs.nextInt();

        for (int i = 0; i < testCases; i++) {
        	out.println(solve());
        }
        
        out.close();
	}
	
	// Saw below video explanation
	// https://www.youtube.com/watch?v=hEkoVLTPoiA&ab_channel=CompetitiveCoding-NewtonSchool
	public static String solve() {
		char[] a = fs.next().toCharArray();
		int n = a.length;
		// open + close = buffer  -- equation 1
		// open - close = count   -- equation 2
		int buffer = 0, count = 0;
		for(char i : a) {
			if(i == '(')
				count--;
			else if(i == ')')
				count++;
			else
				buffer++;
		}
		// by solving equation 1 and 2 we get
		int open = (buffer + count) / 2;
		int close = (buffer - count) / 2;
		
		// if no of open or close is 0 then there is only one way to make RBS
		if(open == 0 || close == 0)
			return "YES";
		
		String openBracket = "(", closeBracket = ")";
		String check = openBracket.repeat(open-1) + closeBracket + openBracket + closeBracket.repeat(close - 1);
//		out.println(check);
		int pointer = 0;
		for(int i = 0; i < n; i++) {
			if(a[i] == '?')
				a[i] = check.charAt(pointer++);
		}
		count = 0;
		for(int i = 0; i < n; i++) {
			if(a[i] == '(')
				count++;
			else 
				count--;
			
			if(count < 0)
				return "YES";
		}
		return "NO";
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
