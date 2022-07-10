package problems_800;

import java.util.Scanner;

public class Problem_996A_Hit_The_Lottery {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		//System.out.println(solve(n));
		System.out.println(optimized(n));
		
		sc.close();
	}
	
	// Optimized Solution
	public static int optimized(int n) {
		int bills = 0, mod = 0;
		
		// For 100
		mod = n % 100;
		bills += (n / 100);
		n = mod;
		
		mod = n % 20;
		bills += (n / 20);
		n = mod;
		
		mod = n % 10;
		bills += (n / 10);
		n = mod;
		
		mod = n % 5;
		bills += (n / 5);
		n = mod;
		
		return bills + n;
	}

	// Brute Force solution
	public static int solve(int n) {
		int bills =  0;
		
		while(n > 0) {
			if(n % 100 == 0) {
				n -= 100;
				bills++;
			}
			else if(n % 20 == 0) {
				n -= 20;
				bills++;
			}
			else if(n % 10 == 0) {
				n -= 10;
				bills++;
			}
			else if(n % 5 == 0) {
				n -= 5;
				bills++;
			}
			else {
				n--;
				bills++;
			}
		}
		return bills;
	}

}
