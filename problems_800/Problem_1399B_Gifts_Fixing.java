package problems_800;

import java.util.Scanner;

public class Problem_1399B_Gifts_Fixing {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		 
        sc.nextLine();
 
        for (int i = 0; i < testCases; i++) {
        	System.out.println(solve(sc));
        }
        
        sc.close();
	}
	
	public static long solve(Scanner sc) {
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		int minA = 1000000007, minB = 1000000007;
		long moves = 0;
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			minA = Math.min(minA, a[i]);
		}
		for(int i = 0; i < n; i++) {
			b[i] = sc.nextInt();
			minB = Math.min(minB, b[i]);
		}
		
		for(int i = 0; i < n; i++) {
			moves += Math.max(a[i] - minA, b[i] - minB);
		}
		
		return moves;
	}
}
