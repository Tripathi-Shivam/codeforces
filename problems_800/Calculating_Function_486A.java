package problems_800;

import java.util.Scanner;

public class Calculating_Function_486A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		
		System.out.println(optimal(n));
		
		//System.out.println(iterative(n));
		
		sc.close();
	}
	
	// constant time
	public static long optimal(long n) {
		if(n % 2 == 0)
			return n / 2;
		else 
			return -(n + 1) / 2;
	}
	
	// doesn't work when n is very large
	// thrown TLE when n=100000000
	public static long iterative(long n) {
		long ans = 0L;
		
		for(long i = 1; i <= n; i++) {
			if(i % 2 == 0)
				ans += i;
			else
				ans -= i;
		}
		
		return ans;
	}

}
