package problems_800;

import java.util.Scanner;

public class Problem_1343B_Balanced_Array {

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
		n /= 2;
		if((n & 1) != 0) {
			System.out.println("NO");
			return;
		}
		System.out.println("YES");
		for (int i = 1; i <= n; ++i) {
			System.out.print(i * 2 + " ");
		}
		for (int i = 1; i < n; ++i) {
			System.out.print(i * 2 - 1 + " ");
		}
		System.out.print(3 * n - 1);
		System.out.println();
	}
}
