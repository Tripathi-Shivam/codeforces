package problems_800;

import java.util.Scanner;

public class Problem_1352A_Sum_Of_Round_Numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		 
        sc.nextLine();
 
        for (int i = 0; i < testCases; i++) {
        	solve(sc.nextInt());
        }
		
		sc.close();
	}

	public static void solve(int n) {
		int[] a = new int[6];
		int count = 0;
		for(int i = 1; i < a.length; i++) {
			a[i] = n % 10;
			n /= 10;
			if(a[i] != 0)
				count++;
		}
		System.out.println(count);
		int x = 1;
		for(int i = 1; i < a.length; i++) {
			if(a[i] != 0) {
				System.out.print((a[i] * x)  + " ");			
			}
			x *= 10;
		}
		System.out.println();
	}
}
