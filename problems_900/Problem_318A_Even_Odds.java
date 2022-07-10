package problems_900;

import java.util.Scanner;

public class Problem_318A_Even_Odds {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(solve(sc.nextLong(), sc.nextLong()));
		
		sc.close();
	}

	public static long solve(long n, long k) {
		if((n+1) / 2 >= k) {
			return (2L * k) - 1;
		}
		else {
			return ((k - (n+1) / 2)) * 2;
		}
	}
}
