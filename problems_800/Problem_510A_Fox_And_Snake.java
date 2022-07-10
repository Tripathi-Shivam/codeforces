package problems_800;

import java.util.Scanner;

public class Problem_510A_Fox_And_Snake {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		solve(n, m);
		
		sc.close();
	}
	
	public static void solve(int n, int m) {
		for(int i = 1; i <= n; i++) {
			if(i % 4 == 2) {
				for(int j = 1; j < m; j++)
					System.out.print(".");
				System.out.print("#");
				System.out.println();
			}
			else if(i % 4 == 0) {
				System.out.print("#");
				for(int j = 1; j < m; j++)
					System.out.print(".");
				System.out.println();
			}
			else {
				for(int j = 1; j <= m; j++)
					System.out.print("#");
				System.out.println();
			}
		}
	}
}
