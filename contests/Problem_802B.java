package contests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Problem_802B {

	public static FastScanner fs = new FastScanner();
    public static PrintWriter out = new PrintWriter(System.out);
	
	public static void main(String[] args) {
		int testCases = fs.nextInt();

        for (int i = 0; i < testCases; i++) {
        	out.println(solve(fs.nextInt(), fs.nextInt()));
        }
        
        out.close();
	}
	
	public static int solve(int n, int a) {
		int startingPoint = (int) Math.pow(10, (n-1));
		boolean isPalindrome = false;
		while(startingPoint < Math.pow(10, n)) {
//			out.println(startingPoint);
			int sum = a + startingPoint;
//			out.println(sum);
			isPalindrome = palindrome(sum, n);
			if(isPalindrome)
				break;
			startingPoint++;
		}
		
		return startingPoint;
	}
	
	public static boolean palindrome(int sum, int n) {
		int temp = sum, reverse = 0;
		
		while(temp > 0) {
			reverse = (temp % 10) + (10 * reverse);
			temp /= 10;
		}
//		out.println(reverse);
		return (sum == reverse) ? true : false;
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
