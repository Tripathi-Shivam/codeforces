package a2oj_ladder_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Problem_276B_LittleGirlAndGame {

	public static FastScanner fs = new FastScanner();
    public static PrintWriter out = new PrintWriter(System.out);
	
	public static void main(String[] args) {
        out.println(solve());
        out.close();
	}

	public static String solve() {
		String s = fs.next();
		char[] a = s.toCharArray();
		int[] count = new int[26];
		int n = a.length;
		for(int i = 0; i < n; i++) 
			count[a[i] - 97]++;
		
		int countOdd = 0, countEven = 0;
		for(int i : count) {
			if(i % 2 == 0)
				countEven++;
			else 
				countOdd++;
		}
		boolean firstTurn = false;
		while(n > 0) {
			firstTurn = !firstTurn;
			if(n % 2 == 0 && countOdd == 0) {
				break;
			}
			else if(n % 2 == 0 && countOdd > 0) {
				countOdd--;
				n--;
			}
			else if(n % 2 == 1 && countOdd == 1) {
				break;
			}
			else if(n % 2 == 1 && countOdd > 1) {
				countOdd--;
				n--;
				break;
			}
		}
		
		return (firstTurn) ? "First" : "Second";
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
