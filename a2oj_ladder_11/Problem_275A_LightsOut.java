package a2oj_ladder_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Problem_275A_LightsOut {

	public static FastScanner s = new FastScanner();
    public static PrintWriter out = new PrintWriter(System.out);
	
	public static void main(String[] args) {
		solve();
        out.close();
	}

	public static void solve() {
		int[][] gridPressed = new int[3][3];
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				gridPressed[i][j] = s.nextInt();
			}
		}
		boolean[][] gridLights = new boolean[3][3];
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				gridLights[i][j] = true;
			}
		}
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(gridPressed[i][j] % 2 == 1) {
					switchLights(gridLights, i, j);
				}
			}
		}
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(gridLights[i][j])
					out.print(1);
				else
					out.print(0);
			}
			out.println();
		}
	}
	
	public static void switchLights(boolean[][] a, int i, int j) {
		a[i][j] = !a[i][j];
		if(i == 0 && j == 0) {
			a[i][j+1] = !a[i][j+1];
			a[i+1][j] = !a[i+1][j];
		}
		else if(i == 0 && j == 2) {
			a[i][j-1] = !a[i][j-1];
			a[i+1][j] = !a[i+1][j];
		}
		else if(i == 2 && j == 0) {
			a[i-1][j] = !a[i-1][j];
			a[i][j+1] = !a[i][j+1];
		}
		else if(i == 2 && j == 2) {
			a[i][j-1] = !a[i][j-1];
			a[i-1][j] = !a[i-1][j];
		}
		else if(i == 0 && j == 1) {
			a[i][j-1] = !a[i][j-1];
			a[i][j+1] = !a[i][j+1];
			a[i+1][j] = !a[i+1][j];
		}
		else if(i == 1 && j == 0) {
			a[i-1][j] = !a[i-1][j];
			a[i+1][j] = !a[i+1][j];
			a[i][j+1] = !a[i][j+1];
		}
		else if(i == 1 && j == 2) {
			a[i-1][j] = !a[i-1][j];
			a[i+1][j] = !a[i+1][j];
			a[i][j-1] = !a[i][j-1];
		}
		else if(i == 2 && j == 1) {
			a[i][j-1] = !a[i][j-1];
			a[i][j+1] = !a[i][j+1];
			a[i-1][j] = !a[i-1][j];
		}
		else {
			a[i][j-1] = !a[i][j-1];
			a[i][j+1] = !a[i][j+1];
			a[i-1][j] = !a[i-1][j];
			a[i+1][j] = !a[i+1][j];
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
