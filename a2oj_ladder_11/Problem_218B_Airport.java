package a2oj_ladder_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Problem_218B_Airport {

	public static FastScanner fs = new FastScanner();
    public static PrintWriter out = new PrintWriter(System.out);
	
	public static void main(String[] args) {        
        solve();
        out.close();
	}
	
	public static void solve() {
		int n = fs.nextInt(), m = fs.nextInt();
		int[] a = fs.readArray(m);
		Queue<Integer> min = new PriorityQueue<>();
		Queue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
		for(int i : a) {
			min.add(i);
			max.add(i);
		}
		
		int maxSum = 0, passengers = n;
		while(passengers > 0) {
			int top = max.poll();
			maxSum += top;
			top--;
			max.add(top);
			passengers--;
		}
		
		passengers = n;
		int minSum = 0;
		while(passengers > 0) {
			int top = min.poll();
			minSum += top;
			top--;
			if(top != 0)
				min.add(top);				
			passengers--;
		}
		
		/*
		// One more way to find minimum sum
		int minSum = 0;
		int i = 0;
		passengers = n;
		while(passengers > 0 && i < m) {
			if(a[i] <= passengers) {
				minSum += ((a[i] * (a[i] + 1)) / 2);
				passengers -= a[i];
			}
			else {
				int difference = a[i] - passengers;
				minSum += (((a[i] - difference) * ((a[i] - difference) + 1)) / 2);
				passengers = 0;
			}
			i++;
		}
		*/
		out.println(maxSum + " " + minSum);
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
