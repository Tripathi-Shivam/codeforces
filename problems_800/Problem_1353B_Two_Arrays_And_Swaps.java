package problems_800;

import java.util.Arrays;
import java.util.Scanner;

public class Problem_1353B_Two_Arrays_And_Swaps {

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
		int k = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for(int i = 0; i < n; i++) 
			a[i] = sc.nextInt();
		for(int i = 0; i < n; i++) 
			b[i] = sc.nextInt();
		int sum = 0;
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		for(int i = 0; i < n && k > 0; i++) {
			if(a[i] < b[n - 1 - i]) {
				int temp = a[i];
				a[i] = b[n - 1 - i];
				b[n - 1 - i] = temp;
				k--;
			}
			else 
				break;
		}
		for(int i : a)
			sum += i;
		
		return sum;
	}
}
