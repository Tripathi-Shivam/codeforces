package problems_800;

import java.util.Scanner;

public class Problem_1374A_Required_Remainder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		 
        sc.nextLine();
 
        for (int i = 0; i < testCases; i++) {
        	System.out.println(solve(sc.nextInt(), sc.nextInt(), sc.nextInt()));
        }
		
		sc.close();
	}
	
	public static int solve(int x, int y, int n) {
		int optionOne = n - (n % x) + y;
		int optionTwo = n - (n % x) - (x - y);
		
		if(optionOne <= n)
			return optionOne;
		else 
			return optionTwo;
	}
}
