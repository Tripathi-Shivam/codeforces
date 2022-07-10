package problems_900;

import java.util.Scanner;

public class Problem_580A_Kefa_And_First_Steps {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(solve(sc));
		
		sc.close();
	}

	public static int solve(Scanner sc) {
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) 
			a[i] = sc.nextInt();
		
		int maxCount = 1, currentCount = 1, previous = a[0];
		
		for(int i = 1; i < n; i++) {
			if(a[i] >= previous) {
				currentCount++;
			}
			else {
				currentCount = 1;
			}
			maxCount = Math.max(maxCount, currentCount);
			previous = a[i];
		}
		
		return maxCount;
	}
}
