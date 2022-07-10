package a2oj_ladder_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Problem_275A_LightsOut2 {

	public static FastScanner s = new FastScanner();
    public static PrintWriter out = new PrintWriter(System.out);
	
	public static void main(String[] args) {
		solve();
        out.close();
	}

	public static void solve() {
		int[][] gridPressed = new int[5][5];
		int[][] gridLights = new int[5][5];
		for(int i = 1; i <= 3; i++) {
			for(int j = 1; j <= 3; j++) {
				gridPressed[i][j] = s.nextInt();
				gridLights[i][j] = gridPressed[i][j];
			}
		}
		for(int i = 1; i <= 3; i++) {
			for(int j = 1; j <= 3; j++) {
				gridLights[i][j+1] += gridPressed[i][j];
				gridLights[i][j-1] += gridPressed[i][j];
				gridLights[i+1][j] += gridPressed[i][j];
				gridLights[i-1][j] += gridPressed[i][j];
			}
		}
		for(int i = 1; i <= 3; i++) {
			for(int j = 1; j <= 3; j++) {
				if(gridLights[i][j] % 2 == 0) {
					out.print(1);
				}
				else {
					out.print(0);
				}
			}
			out.println();
		}
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
