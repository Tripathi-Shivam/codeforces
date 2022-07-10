package problems_800;

import java.util.Scanner;

public class Problem_1335A_Candies_And_Two_Sisters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- > 0) {
			int n = sc.nextInt();
			System.out.println(solve(n));
		}
		
		sc.close();
	}

	public static int solve(int n) {
		return (n % 2 == 0) ? (n - 1) / 2 : n / 2;
	}
}
