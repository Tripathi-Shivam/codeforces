package problems_800;

import java.util.Scanner;

public class Problem_1409A_Yet_Another_Two_Integers_Problem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		 
        sc.nextLine();
 
        for (int i = 0; i < testCases; i++) {
        	System.out.println(solve(sc.nextInt(), sc.nextInt()));
        }
        
        sc.close();
	}

	public static int solve(int a, int b) {
		if(a == b)
			return 0;
		if(a > b) {
			int x = a - b;
			int y = x % 10;
			return (x / 10) + ((y == 0) ? 0 : 1);
		}
		else {
			int x = b - a;
			int y = x % 10;
			return (x / 10) + ((y == 0) ? 0 : 1);
		}
	}
}
