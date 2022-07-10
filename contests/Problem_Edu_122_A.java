package contests;

import java.util.Scanner;

public class Problem_Edu_122_A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		 
        sc.nextLine();
 
        for (int i = 0; i < testCases; i++) {
        	System.out.println(solve(sc));;
        }
        
        sc.close();

	}
	
	public static int solve(Scanner sc) {
		int n = sc.nextInt();
		if(n % 7 == 0) {
			return n;
		}
		int remainder = n % 7;
		if(n % 10 > 6) {
			 return n - remainder;
		}
		else if(n % 10 <= 3) {
			return n + (7 - remainder);
		}
		else {
			if(n % 10 >= remainder)
				return n - remainder;
			else 
				return n + (7 - remainder);
		}
	}
}
