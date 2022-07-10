package problems_900;

import java.util.Scanner;

public class Problem_451A_Game_With_Sticks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(solve(sc.nextInt(), sc.nextInt()));
		
		sc.close();
	}
	
	public static String solve(int n, int m) {
		int min = Math.min(n, m);
		if((min & 1) == 1)
			return "Akshat";
		else
			return "Malvika";
	}
}