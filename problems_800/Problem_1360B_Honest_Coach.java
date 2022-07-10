package problems_800;

import java.util.Scanner;

public class Problem_1360B_Honest_Coach {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		 
        sc.nextLine();
 
        for (int i = 0; i < testCases; i++) {
        	System.out.println(solve(sc));
        }
        
        sc.close();
	}

	public static int solve(Scanner sc) {
		int n = sc.nextInt();
		int[] a = new int[n];
		int min = 10000;
		
		for(int i = 0; i < n; i++) 
			 a[i] = sc.nextInt();
		
		for(int i = 0; i < n-1; i++) {
			for(int j = i+1; j < n; j++) {
				min = Math.min(min, Math.abs(a[i] - a[j]));				
			}
		}
		
		return min;
	}
}
