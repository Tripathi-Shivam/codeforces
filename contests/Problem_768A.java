package contests;

import java.util.Scanner;

public class Problem_768A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		 
        sc.nextLine();
 
        for (int i = 0; i < testCases; i++) 
            solve(sc.nextInt(), sc);
        
        sc.close();
	}
	
	public static void solve(int n, Scanner sc) {
		int[] a = new int[n];
		int[] b = new int[n];	
		
		for(int i = 0; i < n; i++) 
			a[i] = sc.nextInt();
		
		for(int i = 0; i < n; i++) 
			b[i] = sc.nextInt();
		
		
		for(int i = 0; i < n; i++) {
			if(a[i] < b[i]) {
				int temp = a[i];
				a[i] = b[i];
				b[i] = temp;
			}
		}
		System.out.println(findMax(a) * findMax(b));
	}
	
	
	public static int findMax(int[] arr) {
		int max = 1;
		
		for(int i : arr)
			max = Math.max(i, max);
		
		return max;
	}
	
	public static int findMin(int[] arr) {
		int min = 10000;
		
		for(int i : arr)
			min = Math.min(i, min);
		
		return min;
	}
}
