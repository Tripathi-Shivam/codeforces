package contests;

import java.util.Scanner;

public class Problem_768C {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		
		
 
        for (int i = 0; i < testCases; i++) 
            solve(sc.nextInt(), sc.nextInt());
        
        sc.close();
	}
	
	public static void solve(int n, int k) {
		int[][] pairs = new int[n / 2][2];
		for(int i = 0; i < n / 2; i++) {
			pairs[i][0] = i;
		}
		for(int i = 0; i < n / 2; i++) {
			pairs[i][1] = n - i - 1;
		}
		for(int i = 0; i < n / 2; i++) {
			System.out.print(pairs[i][0] + " " + pairs[i][1]);
			System.out.println();
		}
	}
}
