package problems_900;

import java.util.Scanner;

public class Problem_405A_Gravity_Flip {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		solve(sc);
		
		sc.close();
	}

	public static void solve(Scanner sc) {
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) 
			a[i] = sc.nextInt();

		for(int i = 0; i < n-1; i++) {
			for(int j = i+1; j < n; j++) {
				if(a[i] > a[j]) {
					swap(a, i, j);
				}
			}
		}
		
		for(int i : a)
			System.out.print(i + " ");
		
	}
	
	public static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
