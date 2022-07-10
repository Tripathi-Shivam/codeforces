package problems_800;

import java.util.Scanner;

public class Problem_758A_Holiday_Of_Equality {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int max = -1, count = 0;
		
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			max = Math.max(max, a[i]);
		}
		
		for(int i = 0; i < n; i++) {
			if(a[i] < max) {
				count += max - a[i];
			}
		}
		System.out.println(count);
		
		sc.close();
	}

}
