package problems_900;

import java.util.Arrays;
import java.util.Scanner;

public class Problem_337A_Puzzles {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println(solve(sc));
		
		sc.close();
	}

	public static int solve(Scanner sc) {
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[m];
		for(int i = 0; i < m; i++) 
			a[i] = sc.nextInt();
		
		int globalMin = 1001;
		Arrays.sort(a);
		for(int i = 0; i+n-1 < m; i++) 
			globalMin = Math.min(globalMin, a[i+n-1] - a[i]);
		
		return globalMin;
	}
}