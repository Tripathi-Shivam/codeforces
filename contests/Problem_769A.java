package contests;

import java.util.Scanner;

public class Problem_769A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		 
        sc.nextLine();
 
        for (int i = 0; i < testCases; i++) {
        	solve(sc);
        }
        
        sc.close();

	}
	
	public static void solve(Scanner sc) {
		int n = sc.nextInt();
		sc.nextLine();
		String s = sc.nextLine();
		
		if(s.length() == 1 || s.equals("10") || s.equals("01"))
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
