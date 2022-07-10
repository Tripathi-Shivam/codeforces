package contests;

import java.util.Scanner;

public class Problem_770B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		 
        sc.nextLine();
 
        for (int i = 0; i < testCases; i++) {
        	solve(sc.nextInt(), sc.nextLong(), sc.nextLong(), sc);
        }
        
        sc.close();
	}

	public static void solve(int n, long x, long z, Scanner sc) {
			long y = x + 3L;
			long[] a = new long[n];
			for(int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			long current = x;
			
			for(int i = 0; i < n; i++) {
//				System.out.println("current: " + current);
//				System.out.println("z: " + z);
				if(current == z || (current + a[i] == z) || ((current ^ a[i]) == z)) {
					System.out.println("Alice");
					return;
				}
				else if(current > z)
					current ^= a[i];
				else 
					current += a[i];
			}
			
			current = y;
			for(int i = 0; i < n; i++) {
				if(current == z) {
					System.out.println("Bob");
					return;
				}
				else if(current > z)
					current ^= a[i];
				else 
					current += a[i];
			}
	}
}
