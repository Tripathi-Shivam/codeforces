package contests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem_771A {

	public static FastScanner s = new FastScanner();
    public static PrintWriter out = new PrintWriter(System.out);
	
	public static void main(String[] args) {
		int testCases = s.nextInt();
		 
        for (int i = 0; i < testCases; i++) {
        	solve(s);
//        	out.println(solve(s));
        }
        
        out.close();
	}

	public static void solve(FastScanner s) {
		int n = s.nextInt();
		int[] a = s.readArray(n);
//		for(int i = 0; i < n; i++) 
//			a[i]--;
		
		//first find the out of place element and the element that we need to replace it with
		int outOfPlace = -1, shouldBe = 0;
		for(int i = 0; i < n; i++) {
			if(a[i] != i+1) {
				outOfPlace = a[i];
				shouldBe = i;
				break;
			}
		}
		
		if(outOfPlace == -1) {
			out.println(Arrays.toString(a).replace(",", "").replace("[", "").replace("]", ""));
		}
		else {
			// Find the element in the array that should be in place
			int end = 0;
			for(int i = shouldBe+1; i < n; i++) {
				if(a[i] == shouldBe+1) { 
					end = i;
					break;
				}
			}
			while(shouldBe < end) {
				int temp = a[shouldBe];
				a[shouldBe] = a[end];
				a[end] = temp;
				shouldBe++;
				end--;
			}
			out.println(Arrays.toString(a).replace(",", "").replace("[", "").replace("]", ""));
		}
	}
	
	//copied from secondthread
	static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");
        String next() {
            while (!st.hasMoreTokens())
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
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
