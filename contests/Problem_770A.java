package contests;

import java.util.Scanner;

public class Problem_770A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		 
        sc.nextLine();
 
        for (int i = 0; i < testCases; i++) {
        	System.out.println(solve(sc.nextInt(), sc.nextInt(), sc));
        }
        
        sc.close();
	}
	
	public static int solve(int n, int k, Scanner sc) {
		sc.nextLine();
		String s = sc.nextLine();
		if(s.length() == 1 || k == 0) {
			return 1;
		}
		boolean isPalindrome = true;
		int i = 0, j = s.length() - 1;
		while(i < j) {
			if(s.charAt(i) != s.charAt(j)) {
				isPalindrome = false;
				break;
			}
			i++;
			j--;
		}
		return (isPalindrome) ? 1 : 2;
	}
}
