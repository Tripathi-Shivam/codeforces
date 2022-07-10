package a2oj_ladder_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Problem_144A_ArrivalOfTheGeneral {

	public static FastScanner fs = new FastScanner();
    public static PrintWriter out = new PrintWriter(System.out);
	
	public static void main(String[] args) {
        out.println(solve(fs.nextInt()));
        out.close();
	}

	public static int solve(int n) {
		int[] a = fs.readArray(n);
		
		int max = 0, min = 101, positionOfMax = 0, positionOfMin = 0; // since 1 <= ai <= 100
		for(int i = 0; i < n; i++) {
			if(a[i] > max) {
				max = a[i];
				positionOfMax = i;
			}
			if(a[i] <= min) {
				min = a[i];
				positionOfMin = i;
			}
		}
		if(max == min)
			return 0;
		else if(positionOfMax > positionOfMin) {
			return positionOfMax + (n - 1) - (positionOfMin + 1);
		}
		else if(positionOfMax < positionOfMin) {
			return positionOfMax + (n - 1) - positionOfMin;
		}
		
		return -1;
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
